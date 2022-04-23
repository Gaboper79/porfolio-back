package com.backporfolio.security.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backporfolio.security.dto.JwtDto;
import com.backporfolio.security.dto.LoginUsuario;
import com.backporfolio.security.dto.NuevoUsuario;
import com.backporfolio.security.entity.Rol;
import com.backporfolio.security.entity.Usuario;
import com.backporfolio.security.enums.RolNombre;
import com.backporfolio.security.jwt.JwtProvider;
import com.backporfolio.security.service.RolService;
import com.backporfolio.security.service.UsuarioService;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	RolService rolService;

	@Autowired
	JwtProvider jwtProvider;

	@PostMapping("/nuevo")
	public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ResponseEntity("Campos mal puestos", HttpStatus.BAD_REQUEST);
		}
		if (usuarioService.exitsNyNombreUduario(nuevoUsuario.getNombreUsuario())) {
			return new ResponseEntity("Ese nombre ya existe", HttpStatus.BAD_REQUEST);
		}
		if (usuarioService.exitsNyEmail(nuevoUsuario.getEmail())) {
			return new ResponseEntity("Ese mail ya existe", HttpStatus.BAD_REQUEST);
		}
		Usuario usuario = new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(),
				nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword()));
		Set<Rol> roles = new HashSet<>();
		roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());

		if (nuevoUsuario.getRoles().contains("admin")) {
			roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
			roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
		}
		usuario.setRoles(roles);
		usuarioService.save(usuario);
		return new ResponseEntity("usuario guardado", HttpStatus.CREATED);
	}

	@PostMapping("/login")
	@CrossOrigin
	public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ResponseEntity("CAmpos mal puestos", HttpStatus.BAD_REQUEST);
		}
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtProvider.generateToken(authentication);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
		return new ResponseEntity(jwtDto, HttpStatus.OK);
	}
}

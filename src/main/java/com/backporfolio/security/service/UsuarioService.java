package com.backporfolio.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.security.entity.Usuario;
import com.backporfolio.security.repository.UsuarioRepository;

@Service
@Transactional // varios accesos a la BBDD al mismo tiempo las coordine
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
		return usuarioRepository.findByNombreUsuario(nombreUsuario);
	}

	public boolean exitsNyNombreUduario(String nombreUsuario) {
		return usuarioRepository.existsByNombreUsuario(nombreUsuario);
	}

	public boolean exitsNyEmail(String email) {
		return usuarioRepository.existsByEmail(email);
	}

	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
}

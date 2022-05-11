package com.backporfolio.cloudinary.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.backporfolio.cloudinary.dto.Mensaje;
import com.backporfolio.cloudinary.entity.Imagen;
import com.backporfolio.cloudinary.service.CloudinaryService;
import com.backporfolio.cloudinary.service.ImagenService;

@RestController
@CrossOrigin(origins = "https://porfoliogp-arprog.web.app")
@RequestMapping("/cloudinary")
public class ControllerCloudinary {

	@Autowired
	CloudinaryService cloudinarySVC;

	@Autowired
	ImagenService imagenSVC;

	@GetMapping("/list")
	public ResponseEntity<List<Imagen>> list() {
		List<Imagen> list = imagenSVC.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@PostMapping("/upload")
	public ResponseEntity<Imagen> upload(@RequestParam MultipartFile multipartFile) throws IOException {

		BufferedImage bi = ImageIO.read(multipartFile.getInputStream());
		if (bi == null) {
			return new ResponseEntity(new Mensaje("imagen no valida"), HttpStatus.BAD_REQUEST);
		}
		Map result = cloudinarySVC.upload(multipartFile);
		Imagen imagen = new Imagen((String) result.get("original_filename"), (String) result.get("secure_url"),
				(String) result.get("public_id"));
		imagenSVC.save(imagen);
		return new ResponseEntity(imagen, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) throws IOException {
		if (!imagenSVC.exists(id)) {
			return new ResponseEntity(new Mensaje("No existe la imagen"), HttpStatus.NOT_FOUND);
		}
		Imagen imagen = imagenSVC.getOne(id).get();
		Map result = cloudinarySVC.delete(imagen.getImagenId());
		imagenSVC.delete(id);
		return new ResponseEntity(new Mensaje("Imagen Eliminada"), HttpStatus.OK);
	}

	@GetMapping("load/{id}")
	public ResponseEntity<Imagen> getOnce(@PathVariable("id") int id) {
		if (!imagenSVC.exists(id)) {
			return new ResponseEntity(new Mensaje("No existe la imagen"), HttpStatus.NOT_FOUND);
		}
		Imagen imagen = imagenSVC.getOne(id).get();

		return new ResponseEntity(imagen, HttpStatus.OK);
	}
}

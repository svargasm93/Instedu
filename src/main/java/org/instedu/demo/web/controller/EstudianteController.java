package org.instedu.demo.web.controller;

import java.util.List;

import org.instedu.demo.domain.service.EstudianteService;
import org.instedu.demo.persistance.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
	@Autowired
	private EstudianteService estudianteService;

	/*@GetMapping("/all")
	public ResponseEntity<List<Estudiante>> getAll(){
		return new ResponseEntity<List<Estudiante>>(estudianteService.getAll(), HttpStatus.OK);
	}*/
	@GetMapping("/all")
	public List<Estudiante> getAll(){
		return estudianteService.getAll();
	}
}

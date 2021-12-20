package org.instedu.demo.web.controller;

import java.util.List;

import org.instedu.demo.domain.service.ProfesorService;
import org.instedu.demo.persistance.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/all")
	public List<Profesor> getAll(){
		return profesorService.getAll();
	}
}

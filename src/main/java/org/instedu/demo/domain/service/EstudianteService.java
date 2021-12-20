package org.instedu.demo.domain.service;

import java.util.List;
import java.util.Optional;

import org.instedu.demo.domain.repository.StudentRepository;
import org.instedu.demo.persistance.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Estudiante> getAll(){
		return studentRepository.getAll();
	}
	
	/*public Optional<List<Estudiante>> getByAsignatura(Integer id){
		return studentRepository.getByAsignatura(id);
	}*/
	

}

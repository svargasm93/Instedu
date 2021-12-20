package org.instedu.demo.domain.service;

import java.util.List;

import org.instedu.demo.domain.repository.TeacherRepository;
import org.instedu.demo.persistance.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public List<Profesor> getAll(){
		return teacherRepository.getAll();
	}
}

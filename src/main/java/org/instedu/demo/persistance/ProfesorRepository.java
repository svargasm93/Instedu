package org.instedu.demo.persistance;

import java.util.List;

import org.instedu.demo.domain.repository.TeacherRepository;
import org.instedu.demo.persistance.crud.ProfesorCrudRepository;
import org.instedu.demo.persistance.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProfesorRepository implements TeacherRepository{

	@Autowired
	ProfesorCrudRepository profesorCrudRepository;
	
	@Override
	public List<Profesor> getAll() {
		// TODO Auto-generated method stub
		return (List<Profesor>) profesorCrudRepository.findAll();
	}

}

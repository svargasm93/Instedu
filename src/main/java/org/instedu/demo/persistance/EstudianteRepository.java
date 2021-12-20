package org.instedu.demo.persistance;

import java.util.List;
import java.util.Optional;

import org.instedu.demo.domain.repository.StudentRepository;
import org.instedu.demo.persistance.crud.EstudianteCrudRepository;
import org.instedu.demo.persistance.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepository implements StudentRepository{

	@Autowired
	private EstudianteCrudRepository estudianteCrudRepository;
	
	@Override
	public List<Estudiante> getAll() {
		// TODO Auto-generated method stub
		return (List<Estudiante>) estudianteCrudRepository.findAll();
	}

	/*@Override
	public Optional<List<Estudiante>> getByAsignatura(Integer id) {
		// TODO Auto-generated method stub
		return estudianteCrudRepository.findByIdAsignatura(id); 
	}*/
	
}

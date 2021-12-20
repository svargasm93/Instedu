package org.instedu.demo.persistance.crud;

import java.util.List;
import java.util.Optional;

import org.instedu.demo.persistance.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteCrudRepository extends CrudRepository<Estudiante, Integer>{
	
	//Optional<List<Estudiante>> findByIdAsignatura(Integer idAsignatura);

}

package org.instedu.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import org.instedu.demo.persistance.entity.Estudiante;

public interface StudentRepository {
	List<Estudiante> getAll();
	/*Optional<List<Estudiante>> getByAsignatura(Integer id);*/
		
}

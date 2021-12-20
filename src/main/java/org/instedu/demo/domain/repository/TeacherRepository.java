package org.instedu.demo.domain.repository;

import java.util.List;

import org.instedu.demo.persistance.entity.Profesor;

public interface TeacherRepository {
	List<Profesor> getAll();
}

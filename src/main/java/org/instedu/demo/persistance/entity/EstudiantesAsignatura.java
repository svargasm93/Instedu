package org.instedu.demo.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="estudiantes_asignatura")
public class EstudiantesAsignatura {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEstudiantesAsignatura;
	
	@ManyToOne
	@JoinColumn(name = "idEstudiante", insertable=false, updatable = false)
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "idAsignatura", insertable=false, updatable = false)
	@JsonBackReference
	private Asignatura asignatura;

	//Getters and Setters 
	public Integer getId() {
		return idEstudiantesAsignatura;
	}

	public void setId(Integer idEstudiantesAsignatura) {
		this.idEstudiantesAsignatura = idEstudiantesAsignatura;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	
}

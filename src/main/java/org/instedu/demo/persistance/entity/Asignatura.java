package org.instedu.demo.persistance.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAsignatura;
	
	private String nombre;
	
	@OneToMany(mappedBy = "asignatura")
	private List<EstudiantesAsignatura> estudiantes;
	
	@ManyToOne
	@JoinColumn(name="idCurso", insertable = false, updatable = false)
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name="idProfesor", insertable = false, updatable = false)
	@JsonBackReference
	private Profesor profesor;

	//Getters and Setters 
	public Integer getId() {
		return idAsignatura;
	}

	public void setId(Integer idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public List<EstudiantesAsignatura> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<EstudiantesAsignatura> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}

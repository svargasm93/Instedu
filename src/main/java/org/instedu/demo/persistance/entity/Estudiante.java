package org.instedu.demo.persistance.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="estudiantes")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEstudiante;
	
	private String nombre;
	
	@OneToMany(mappedBy = "estudiante")
	@JsonBackReference
	private List<EstudiantesAsignatura> asignaturas;

	
	//Getters and Setters 
	public Integer getId() {
		return idEstudiante;
	}

	public void setId(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<EstudiantesAsignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<EstudiantesAsignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	
	
	
	
	
}

package org.instedu.demo.persistance.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="colegios")
public class Colegio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idColegio;
	
	
	private String nombre;
	
	@OneToMany(mappedBy = "colegio", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Curso> cursos;

	
	
	//Getters and Setters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Integer getId() {
		return idColegio;
	}

	public void setId(Integer idColegio) {
		this.idColegio = idColegio;
	}
	
	
	
	

}

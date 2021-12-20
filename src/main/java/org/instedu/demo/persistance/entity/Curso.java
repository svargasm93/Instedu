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
@Table(name="cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCurso;
	
	private Integer grado;
	private String salon;
	
	@ManyToOne
	@JoinColumn(name="idColegio", insertable = false, updatable = false, referencedColumnName = "idColegio")
	private Colegio colegio;
	
	@OneToMany(mappedBy = "curso")
	@JsonBackReference
	private List<Asignatura> asignaturas;

	
	
	//Getters and Setters 
	public Integer getId() {
		return idCurso;
	}

	public void setId(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public Integer getGrado() {
		return grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}
	
	
	
	
	
	
}

package fr.Istic.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;


@Entity
public class Sport implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToMany
	private Collection<Locality> locality;
	
	@ManyToMany(mappedBy ="sports")
	private Collection<Person> person;
	
	
	public Sport() {
		super();
	}



	public Sport(String name,Collection<Locality> locality) {
		super();
		this.name = name;
		this.locality = locality;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<Locality> getLocality() {
		return locality;
	}


	
	public void setLocality(Collection<Locality> locality) {
		this.locality = locality;
	}


	@JsonIgnore //pour personne
	public Collection<Person> getPerson() {
		return person;
	}


	
	public void setPerson(Collection<Person> person) {
		this.person = person;
	}


}
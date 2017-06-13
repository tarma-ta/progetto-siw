package it.uniroma3.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Amministartore{
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull
private String nome;
@NotNull
private String cognome;
@NotNull
private String password;

protected Amministartore(){}
public Amministartore (String nome, String cognome, String password){
	this.nome=nome;
	this.cognome=cognome;
	this.password=password;
}
//getter e setter

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}

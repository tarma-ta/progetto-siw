package it.uniroma3.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Utente{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	private boolean enabled;
	@NotBlank
	private String email;
	@NotBlank
	private String nome;
	@NotBlank
	private String cognome;
	@OneToMany(mappedBy = "utente")
	private List<RuoliUtente> ruoliUtente;

	
	public Utente(String email, String password, String nome, String cognome, String permessi, boolean enabled, List<RuoliUtente> ruoliUtente){
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.enabled = enabled;
		this.ruoliUtente = ruoliUtente;
	}

	public Utente(String username, String password, boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public Utente(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public List<RuoliUtente> getRuoliUtente() {
		return ruoliUtente;
	}

	public void setRuoliUtente(List<RuoliUtente> ruoliUtente) {
		this.ruoliUtente = ruoliUtente;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
}

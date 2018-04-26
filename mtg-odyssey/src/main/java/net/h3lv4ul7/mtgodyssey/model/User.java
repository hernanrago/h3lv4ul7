package net.h3lv4ul7.mtgodyssey.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String fullName;
	private String email;
	private String username;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chargeUser")
	private Set<Stock> stockCharged;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="saleUser")
	private Set<Stock> stockSold;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String fullName, String email, String username, String password) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

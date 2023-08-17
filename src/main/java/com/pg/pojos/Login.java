package com.pg.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Entity
@Table(name="login")
@Data
@Getter
@Setter
@NoArgsConstructor


@ToString(exclude = "password")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loginId;
	
	@Column(length=20, nullable=false)
	private String role;
	
	@Column(length=20, nullable=false)
	private String password;
	
	@Column(length=10, nullable=false)
	private String email;
	
	@JsonIgnoreProperties("login")
	@OneToOne(mappedBy = "login",cascade =CascadeType.ALL )	
		private Tenant tenant;
	
	@JsonIgnoreProperties("login")
	@OneToOne(mappedBy = "login",cascade =CascadeType.ALL )	
		private Owner owner;


	public Login(String role, String password, String email, Tenant tenant) {
		super();
		this.role = role;
		this.password = password;
		this.email = email;
		this.tenant = tenant;
	}


	
	

}

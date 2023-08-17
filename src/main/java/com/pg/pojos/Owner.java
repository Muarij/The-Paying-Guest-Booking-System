package com.pg.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="owners")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ownerId;
	
	@Column(length=50,nullable = false)
	private String firstName;
	@Column(length=50,nullable=false)
	private String lastName;
	@Column(length = 10,unique = true)
	private String contactNumber;
	@Column(length=70,nullable = false)
	private String emailId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loginId")
	private Login login;

	
	
}

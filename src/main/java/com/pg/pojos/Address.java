package com.pg.pojos;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer addressId;
	
	@Column(length=50,nullable = false)
	private String streetAddress;
	@Column(length=50,nullable = false)
	private String city;
	@Column(length=50,nullable = false)
	private String country;
	@Column(length=50,nullable = false)
	private int zipcode;
	
	
	@JsonIgnoreProperties("address")
	@OneToOne(mappedBy = "address",fetch = FetchType.LAZY)
	private Room room;

	public Address() {
		super();
	
	}


	
}

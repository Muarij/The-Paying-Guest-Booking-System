package com.pg.pojos;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Entity
@Table(name="tenants")
@Data
@Getter
@Setter
@NoArgsConstructor

public class Tenant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tenantId; 
	
	@Column(length=50,nullable = false)
	private String firstName;
	@Column(length=50,nullable=false)
	private String lastName;
	@Column(length=50,nullable=false)
	private String contactNumber;
	
	
	@Column(length = 70,unique = true,nullable = false)
	private String emailId;
	
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(columnDefinition = "DATE")
	private LocalDate registrationDate;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loginId")
	private Login login;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookingId")
	private Booking booking;
	
}


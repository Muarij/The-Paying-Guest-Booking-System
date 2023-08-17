package com.pg.pojos;

import java.time.LocalDate;

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
import lombok.Setter;
import lombok.*;
@Entity
@Table(name="rooms")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer roomId;
	
	@Column(length=50,nullable=false)
	private Boolean isRoomAvailable;
	
	@Column(length=20,nullable=false)
	public Integer rentPerMonth;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "addressId")
	private Address address;
	
	
	

}

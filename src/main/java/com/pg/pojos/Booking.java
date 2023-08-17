package com.pg.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="bookings")
@Data
@Getter
@Setter
@NoArgsConstructor


public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookingId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(columnDefinition = "DATE", length=50,nullable = false)
	private LocalDate bookingDate;
	
	@Column(length=50,nullable=false)
	private String bookingStatus;
	
	@JsonIgnoreProperties("booking")
	@OneToOne(mappedBy = "booking",cascade =CascadeType.ALL )	
		private Tenant tenant;
}

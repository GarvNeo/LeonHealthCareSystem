package com.capg.healthcarecomplete.entity;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Center {

	@Id
	@GeneratedValue
	private int centerId;
	
	
	private String centerName;
	
	private String centerContactNo;
	
	
	private String centerAddress;

	@OneToMany(targetEntity = Appointment1.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CenApt_FrnKey", referencedColumnName = "centerId")
	private List<Appointment1> appointment1;
	
	@OneToMany(targetEntity = Test.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CenTest_FrnKey", referencedColumnName = "centerId")
	private List<Test> test;
	
}

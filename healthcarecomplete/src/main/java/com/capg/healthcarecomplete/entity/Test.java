package com.capg.healthcarecomplete.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class Test {

	@Id
	@GeneratedValue
	private int testId;
	
	
	private String testName;
	
	@OneToMany(targetEntity = Appointment1.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "foreignKeyAppnTests", referencedColumnName = "testId")
	private List<Appointment1> appointments_test;
	
}

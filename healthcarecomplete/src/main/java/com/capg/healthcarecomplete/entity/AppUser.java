package com.capg.healthcarecomplete.entity;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class AppUser {
//	(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
//	private String userId;
//	
	@Id
	@GeneratedValue
	private int userId;
	
	private String userName;
	
	private String userEmail;
	
	private String userPass;
	
	private BigInteger userContactNo;
	
	private String userGender;
	
	private int userAge;
	
	private String centerAddress;
	
	@OneToMany(targetEntity = Appointment1.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "UserApt_FrnKey", referencedColumnName = "userId")
	private List<Appointment1> appointments_user; 

}

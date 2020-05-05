package com.capg.healthcarecomplete.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Appointment1 {


	@Id
	@GeneratedValue
	private int appointmentId;
	
	private int userId;
	private Timestamp dateTime;
	private int status;
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Appointment1 [appointmentId=" + appointmentId + ", userId=" + userId + ", dateTime=" + dateTime
				+ ", status=" + status + "]";
	}
	public Appointment1(int appointmentId, int userId, Timestamp dateTime, int status) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.dateTime = dateTime;
		this.status = status;
	}

}

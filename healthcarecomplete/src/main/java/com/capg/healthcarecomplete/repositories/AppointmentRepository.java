package com.capg.healthcarecomplete.repositories;
import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.healthcarecomplete.entity.Appointment1;

public interface AppointmentRepository extends JpaRepository<Appointment1,BigInteger>{

}

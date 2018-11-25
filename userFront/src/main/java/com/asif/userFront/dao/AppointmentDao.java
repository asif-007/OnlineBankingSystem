package com.asif.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.asif.userFront.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {
	List<Appointment> findAll();
}

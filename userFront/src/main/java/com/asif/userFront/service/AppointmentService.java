package com.asif.userFront.service;

import java.util.List;
import java.util.Optional;

import com.asif.userFront.domain.Appointment;

public interface AppointmentService {

	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}

package com.asif.userFront.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asif.userFront.dao.AppointmentDao;
import com.asif.userFront.domain.Appointment;
import com.asif.userFront.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;

	public Appointment createAppointment(Appointment appointment) {
		return appointmentDao.save(appointment);
	}

	public List<Appointment> findAll() {
		return appointmentDao.findAll();
	}

	public Appointment findAppointment(Long id) {
        return (Appointment) appointmentDao.findAll();
       }

	public void confirmAppointment(Long id) {
		Appointment appointment = findAppointment(id);
		appointment.setConfirmed(true);
		appointmentDao.save(appointment);
	}

	// @Override
	// public Appointment findAppointment(Long id) {
	// // TODO Auto-generated method stub
	// return appointmentDao.f;
	// }
}

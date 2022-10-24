package com.springboot.web.service;

import java.util.Date;
import java.util.List;

import com.springboot.web.entity.Appointment;

public interface AppointmentService {


	public Appointment saveAppointment(Appointment appointment);

	public List<Appointment> fetchAppointmentList();

	public Appointment cancelAppointment(int appointmentId);

	public List<Integer> getOpenslots(int operatorId, Date date);
}

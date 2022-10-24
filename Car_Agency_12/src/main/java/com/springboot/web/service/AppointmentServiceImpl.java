package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.Appointment;
import com.springboot.web.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
		System.out.println(appointmentRepository);
		System.out.println(appointment);
		return appointmentRepository.save(appointment);
		
	}

	@Override
	public List<Appointment> fetchAppointmentList() {
		
		return appointmentRepository.findByState("booked");
	}

	@Override
	public Appointment cancelAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		
		Optional<Appointment> appointment = appointmentRepository.findById(appointmentId);
		Appointment ap = appointment.get();
		ap.setState("Cancelled");
		return appointmentRepository.save(ap);
		
	}

	@Override
	public List<Integer> getOpenslots(int operatorId, Date date) {
		// TODO Auto-generated method stub
		List<Appointment> appointments = appointmentRepository.findByOperatorIdAndDateCreatedAndState(operatorId,date, "booked");
		List<Integer>startTimeList = new ArrayList<Integer>();
		Set<Integer>se = new HashSet<Integer>();
		for(int i=0; i<appointments.size(); i++)
		{
			se.add(appointments.get(i).getStartTime());
		
		}
		for(int i=0; i<=23; i++)
		{
			if(!se.contains(i))
			{
				startTimeList.add(i);
			}
		}
	
		return startTimeList;
	}

}

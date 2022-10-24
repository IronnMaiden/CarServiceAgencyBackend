package com.springboot.web.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.springboot.web.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer>, QueryByExampleExecutor<Appointment> {


	public List<Appointment> findByState(String state);
	
	public List<Appointment> findByOperatorIdAndDateCreatedAndState(int operatorId, Date dateCreated,String state);
}

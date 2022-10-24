package com.springboot.web.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int appointmentId;
	@Column(name="dateCreated")
	private Date dateCreated;
	@Column(name="customerId")
	private int customerId;
	@Column(name="operatorId")
	private int operatorId;
	@Column(name="startTime")
	private int startTime;
	@Column(name="endTime")
	private int endTime;
	@Column(name="state")
	private String state;

	
	public Appointment()
	{
		
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	public Date getdateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	   
	 public String toString(){//overriding the toString() method  
	 
		 return "appointmentId=" + appointmentId + " " + "dateCreated="+ dateCreated + " " + "customerId="+customerId + " " + "operatorId="+ operatorId + " " + "startTime=" + startTime + " " + "endTime="+ endTime + " " + "state=" + state;
	 }  
	

}

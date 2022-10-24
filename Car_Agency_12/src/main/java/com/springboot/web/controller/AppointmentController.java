package com.springboot.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entity.Appointment;
import com.springboot.web.entity.OpenSlotsreq;
import com.springboot.web.service.AppointmentService;



@RestController
public class AppointmentController {
	
	
	@Autowired
	private AppointmentService appointmentService ;
	
	//Ability to 'book' an appointment
	 @PostMapping("/appointments")
	    public Appointment saveAppointment(@RequestBody Appointment appointment) {
		 
	        
		 	//AppointmentService appointmentService = new AppointmentServiceImpl();
		 	System.out.println(appointment.toString());
		 	//appointment.setDateCreated(Date d = new Date())
		 	return appointmentService.saveAppointment(appointment);
	    }
	 
	 //Ability to show all booked appointments of an operator.
	 
	    @GetMapping("/appointments")
	    public List<Appointment> fetchAppointmentList() {
		 
		 
	        return appointmentService.fetchAppointmentList();
	    }
	 
	    @PatchMapping("/appointments/{id}/cancel")
	    public Appointment cancelAppointment(@PathVariable("id") int appointmentId)
	    {
			return appointmentService.cancelAppointment(appointmentId) ;
	    	
	    }
	    
	    
	    //Ability to show open slots of appointments for an operator.
	    @GetMapping("/operator/{id}/open-slots")
	    public List<Integer> openSlots(@PathVariable("id") int operatorId, @RequestBody OpenSlotsreq req )
	    {
	    	
			return appointmentService.getOpenslots(operatorId,req.getDate());
		}
	 

}

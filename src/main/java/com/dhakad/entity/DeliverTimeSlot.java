package com.dhakad.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DeliverTimeSlot {

	@Id
	private int deliverTimeId;
	private String timeSlot;
	
	public int getDeliverTimeId() {
		return deliverTimeId;
	}
	public void setDeliverTimeId(int deliverTimeId) {
		this.deliverTimeId = deliverTimeId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	
	
	
}

package com.dhakad.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PickUpTimeSlot {

	@Id
	private int pickUpTimeId;
	private String timeSlot;
		
	public int getPickUpTimeId() {
		return pickUpTimeId;
	}
	public void setPickUpTimeId(int pickUpTimeId) {
		this.pickUpTimeId = pickUpTimeId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	


	


}




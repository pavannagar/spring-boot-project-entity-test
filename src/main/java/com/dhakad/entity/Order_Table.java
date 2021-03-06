package com.dhakad.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Order_Table {

	@Id
	private int orderId;
	private int deliveryCharge;
	private int amount;
	private String orderDate;
	private String deliveryDate;
	@ManyToOne
	private Customer customer;
	@OneToOne
	@JoinColumn(name="status_id",referencedColumnName = "statusId")
	private Status status; 
	@OneToOne
	@JoinColumn(name = "pickup_id",referencedColumnName = "pickUpTimeId")
	private PickUpTimeSlot pickUpTimeSlot;
	@OneToOne
	@JoinColumn(name = "deliver_id",referencedColumnName = "deliverTimeId")
	private DeliverTimeSlot deliverTimeSlot; 
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<OrderItem> orderItem= new ArrayList<>();
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(int deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public PickUpTimeSlot getPickUpTimeSlot() {
		return pickUpTimeSlot;
	}
	public void setPickUpTimeSlot(PickUpTimeSlot pickUpTimeSlot) {
		this.pickUpTimeSlot = pickUpTimeSlot;
	}
	public DeliverTimeSlot getDeliverTimeSlot() {
		return deliverTimeSlot;
	}
	public void setDeliverTimeSlot(DeliverTimeSlot deliverTimeSlot) {
		this.deliverTimeSlot = deliverTimeSlot;
	}
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	
	
	
	
}

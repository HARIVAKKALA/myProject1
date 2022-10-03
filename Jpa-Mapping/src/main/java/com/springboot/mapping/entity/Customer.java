package com.springboot.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="customer_name")
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_item_id")
	private Item item;

	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}

package com.springboot.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="item_name")
	private String itemname;
	

	public Item(String item) {
		this.itemname= item;
	}
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
	private Customer customer;
	
}

package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_department")
@Setter
@Getter
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	//@JsonProperty("full_name")// it will provide alias name in json response
	@Column(name = "name")
	//@NotNull(message="name must not be null value") it will check only Null value but  accept "" empty space as a value 
	//@NotEmpty(message="name must not be null value") it is also having the issue it's accepted ("   ") as a null value
	@NotBlank(message="name must not be null value")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

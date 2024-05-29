package com.example.AOP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Dept01")
@Data
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;
	private String name;

}

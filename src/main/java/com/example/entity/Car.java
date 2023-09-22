package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name ="Car")
@Data
public class Car {


@OneToMany
@JoinColumn(name="car_id", referencedColumnName="id")
private List<Transaction>transactions;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name= "id")
private Integer id;

@Column(name= "car_year")
private Integer carYear;

@Column(name= "model")
private String model;

@Column(name= "make")
private String make;

@Column(name="mileage")
private Integer miles;

@Column(name="price")
private BigDecimal price;

@Column(name="date_purchased")
private LocalDate date;

@Column(name="sold", nullable= false)
private boolean sold;

@Column(name="Photo")
private String photoURL;

@Column(name="Transmission")
private String transmissionType;



public Car() {
}



}

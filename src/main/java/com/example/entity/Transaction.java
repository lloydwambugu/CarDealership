package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Transactions")
public class Transaction {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name= "id")
private Integer id;

private LocalDate date;


@ManyToOne
@JoinColumn(name="buyer_id", referencedColumnName = "id")
private Buyer buyer;
public Transaction() {
}



public Integer getId() {
    return id;
}



public void setId(Integer id) {
    this.id = id;
}




}







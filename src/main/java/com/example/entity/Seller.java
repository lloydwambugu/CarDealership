package com.example.entity; 

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="Sellers")
public class Seller {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name= "id")
private Integer id;

@OneToMany
@JoinColumn(name="seller_id", referencedColumnName="id")
private List<Transaction>transactions;

@Column(name= "first_name")
private String firstName;

@Column(name= "last_name")
private String lastName;

@Column(name= "email")
private String email;

@Column(name= "password")
private String password;

@Column(name= "employee_code")
private int verificationNumber;


public Seller() {
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public int getVerificationNumber() {
    return verificationNumber;
}

public void setVerificationNumber(int verificationNumber) {
    this.verificationNumber = verificationNumber;
}



}

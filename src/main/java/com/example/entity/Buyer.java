package com.example.entity;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Buyers")
public class Buyer {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;

@Column(name="first_name")
private String firstName;

@Column(name="last_name")
private String lastName;

@Column(name ="email", unique = true)
private String email;

@Column(name ="password")
private String password;

@Column(name ="phone_number", unique = true)
private long phoneNumber;

@Column(name ="address")
private String address;


public Buyer() {

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


public long getPhoneNumber() {
    return phoneNumber;
}


public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
}



}

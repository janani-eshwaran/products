package com.example21.demo21.entity;

import jakarta.validation.constraints.NotEmpty;

public class ClientDto {

    @NotEmpty(message="The First Name is Reqiured")
    private String firstName;

    @NotEmpty(message="the Last Name is Required")
    private String lastName;

    @NotEmpty(message="The Email is Required")
    private String email;

    private String phone;
    private String address;

    @NotEmpty(message="The Status is Required")
    private String status;



    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.example.crud2.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "details")
@Data
public class MyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    @JsonProperty("u_id")
    private Long id;

    @Column(name = "user_name")
    @JsonProperty("u_name")
    private String name;

    @Column(name = "user_lastname")
    @JsonProperty("u_lastname")
    private String lastname;

    @Column(name = "user_phone")
    @JsonProperty("u_phone")
    private long phone;

    @Column(name = "user_address")
    @JsonProperty("u_address")
    private String address;
}

    /*public MyEntity() {
    }

    public MyEntity(Long id, String name, String lastname, long phone, String address) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}*/

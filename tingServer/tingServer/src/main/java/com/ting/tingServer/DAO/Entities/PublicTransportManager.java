package com.ting.tingServer.DAO.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PublicTransportManager {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    private String password;
    private String nic;
    private String email;
    private String phoneNumber;
    private String district;
    private Integer postalCode;
}

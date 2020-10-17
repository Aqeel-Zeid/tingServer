package com.ting.tingServer.DAO.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inspector {

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

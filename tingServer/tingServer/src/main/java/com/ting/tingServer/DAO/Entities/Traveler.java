package com.ting.tingServer.DAO.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Traveler {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private TravelCard travelCards;

    private String name;
    private String nic;
    private String email;
    private String phoneNumber;
    private String district;
    private Integer postalCode;

}

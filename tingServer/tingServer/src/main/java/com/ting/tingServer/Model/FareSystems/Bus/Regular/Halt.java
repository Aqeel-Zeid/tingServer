package com.ting.tingServer.Model.FareSystems.Bus.Regular;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Halt {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private int haltIndex;
    private double latitude;
    private double longitude;
    private  String name;
    @ManyToOne
    private Route route;

}

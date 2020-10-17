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
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class BusFareCollector {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String busNumberPlate;

}

package com.ting.tingServer.DAO.Entities;

import com.ting.tingServer.Model.FareSystems.Bus.Regular.Bus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class RouteSchedule {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Route route;
    private String startTime;
    private Bus bus;

}

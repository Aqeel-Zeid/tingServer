package com.ting.tingServer.Model.FareSystems.Bus.Regular;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Route {


    private String routeName;
    private List<Halt> busHalts;
    private List<Bus> busList;
    private List<Schedule> busSchedules;
    private RoutePricingMatrix routePricingMatrix;
}

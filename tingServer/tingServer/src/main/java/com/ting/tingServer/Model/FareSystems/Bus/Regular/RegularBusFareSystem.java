package com.ting.tingServer.Model.FareSystems.Bus.Regular;

import com.ting.tingServer.Model.FareSystems.FareSystem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter @Getter @AllArgsConstructor
public class RegularBusFareSystem extends FareSystem {

    private List<Route> routes;
    private RoutePricingMatrix routePricingMatrix;
    private Schedule schedule;

    public RegularBusFareSystem() {
        super.name = "REGULAR_BUS_FARE";
        super.mainVersion = 1;
        super.subVersion = 0;
    }

    @Override
    public Float calculateFare() {
        return null;
    }
}

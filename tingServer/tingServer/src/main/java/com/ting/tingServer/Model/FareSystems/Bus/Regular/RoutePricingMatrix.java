package com.ting.tingServer.Model.FareSystems.Bus.Regular;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class RoutePricingMatrix {
    List<RoutePrice> routePrices;
}

@AllArgsConstructor @Setter @Getter
class RoutePrice{

    private Halt startingHalt;
    private Halt endHalt;
    private Float price;

}

package com.ting.tingServer.Model.TravelLog;

import com.ting.tingServer.Model.FareSystems.Bus.Regular.Halt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class GotInBusEvent extends TravelEvent {

    private Halt startingBusHalt;

}

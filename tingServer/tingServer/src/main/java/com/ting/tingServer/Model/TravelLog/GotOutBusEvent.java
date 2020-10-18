package com.ting.tingServer.Model.TravelLog;

import com.ting.tingServer.Model.FareSystems.Bus.Regular.Halt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GotOutBusEvent {
    private Halt endingBusHalt;
}

package com.ting.tingServer.Model.FareSystems.Bus.Regular;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Schedule {

    private Bus bus;
    private Date startTime;
    private Date endTime;
    private Halt startHalt;
    private Halt endHalt;

}

package com.ting.tingServer.Model.TravelLog;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class TravelEvent {

    private String description;
    private Date timeStamp;

}

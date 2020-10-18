package com.ting.tingServer.Controller.jsonResponseFormats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PinAuthenticationResponse {

    private String  travelCardID;
    private Double pin;

}

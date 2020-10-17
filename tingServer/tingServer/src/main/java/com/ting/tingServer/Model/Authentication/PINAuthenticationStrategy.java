package com.ting.tingServer.Model.Authentication;

import lombok.Getter;
import lombok.Setter;

public class PINAuthenticationStrategy implements CardAuthentication {

    @Setter @Getter
    Integer pin;


    @Override
    public TravelCard authenticate() {
        return null;
    }
}

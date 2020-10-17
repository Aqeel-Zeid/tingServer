package com.ting.tingServer.Model.Authentication;

import lombok.Getter;
import lombok.Setter;

public class TravelerAuthenticationStrategy implements  LoginAuthentication{

    @Setter @Getter
    private String travelerID;

    @Override
    public User authenticate() {
        return null;
    }
}

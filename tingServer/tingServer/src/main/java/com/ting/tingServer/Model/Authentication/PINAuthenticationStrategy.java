package com.ting.tingServer.Model.Authentication;

import com.ting.tingServer.DAO.Entities.TravelCard;
import com.ting.tingServer.DAO.Repos.TravelCardRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class PINAuthenticationStrategy implements CardAuthentication {

    @Getter
    Integer pin;

    @Setter @Getter
    String travelCard;

    @Autowired
    TravelCardRepository travelCardRepository;

    @Override
    public TravelCard authenticate() {
        com.ting.tingServer.DAO.Entities.TravelCard travelCard = travelCardRepository.findDistinctByTravelCardIDEquals(this.getTravelCard());
        if(this.pin.equals(travelCard.getPin()))
        {
            return travelCard;
        }
        else {
            return null;
        }

    }

    public void setPin(Double pin) {
        this.pin = pin;
    }
}

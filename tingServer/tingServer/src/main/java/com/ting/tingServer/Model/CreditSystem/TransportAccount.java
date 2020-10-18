package com.ting.tingServer.Model.CreditSystem;

import com.ting.tingServer.DAO.Entities.Traveler;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class TransportAccount {

    @Setter
    Traveler traveler;
    @Getter @Setter
    List<CreditEvent> creditEventList;

    public CreditEvent getLastCreditEvent(){ return  null ;};
    public Integer getBalance(){ return 0; };
    public void addCreditEvent(CreditEvent creditEvent){};

}

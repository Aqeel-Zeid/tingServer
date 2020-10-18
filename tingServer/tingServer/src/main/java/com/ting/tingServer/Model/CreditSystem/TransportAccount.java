package com.ting.tingServer.Model.CreditSystem;

import com.ting.tingServer.DAO.Entities.Traveler;
import com.ting.tingServer.DAO.Repos.CreditEventRepo;
import com.ting.tingServer.DAO.Repos.TravelerRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class TransportAccount {

    public TransportAccount(Traveler traveler) {
        this.traveler = traveler;

    }

    @Autowired
    CreditEventRepo creditEventRepo;

    @Autowired
    TravelerRepository travelerRepository;

    @Setter
    Traveler traveler;
    @Getter @Setter
    List<CreditEvent> creditEventList;

    public CreditEvent getLastCreditEvent(){

//        System.out.println(this.traveler.getName() + "Last Credit Event");
//        List<CreditEvent> creditEvents = (List<CreditEvent>) creditEventRepo.findAll();
//        System.out.println("last Credit Event" + creditEvents ) ;
        return  new CreditEvent() ;
    };

        public Integer getBalance(){

        //Grab the Latest Event From The DataBase
        CreditEvent lastCreditEvent = this.getLastCreditEvent();
        //System.out.println("last Credit Event" + lastCreditEvent.timeStamp.toString());

        return 400;
    };
    public void addCreditEvent(CreditEvent creditEvent){};

}

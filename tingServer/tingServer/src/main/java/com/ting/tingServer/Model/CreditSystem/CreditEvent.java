package com.ting.tingServer.Model.CreditSystem;

import com.ting.tingServer.DAO.Entities.Traveler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class CreditEvent {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Traveler traveler;

    String type ; // CREDIT or DEBIT
    String description ;

    @Temporal(TemporalType.DATE)
    Date timeStamp;

    Integer finalBalance;
}

package com.ting.tingServer.DAO.Repos;

import com.ting.tingServer.DAO.Entities.TravelCard;
import com.ting.tingServer.DAO.Entities.Traveler;
import org.springframework.data.repository.CrudRepository;

public interface TravelCardRepository extends CrudRepository< TravelCard , Integer > {

    TravelCard findDistinctByTravelCardIDEquals(String travelCardID);
}

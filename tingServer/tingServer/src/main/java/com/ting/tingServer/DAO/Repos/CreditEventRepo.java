package com.ting.tingServer.DAO.Repos;

import com.ting.tingServer.DAO.Entities.Traveler;
import com.ting.tingServer.Model.CreditSystem.CreditEvent;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface CreditEventRepo extends CrudRepository<CreditEvent,Integer> {

    List<CreditEvent> findAllByTravelerEquals(Traveler traveler);
}

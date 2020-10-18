package com.ting.tingServer.DAO.Repos;

import com.ting.tingServer.DAO.Entities.Traveler;
import com.ting.tingServer.Model.CreditSystem.CreditEvent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TravelerRepository extends CrudRepository<Traveler,Integer> {


}

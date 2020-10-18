package com.ting.tingServer.DAO.Repos;

import com.ting.tingServer.DAO.Entities.Route;
import org.springframework.data.repository.CrudRepository;

public interface RouteRepo extends CrudRepository<Route,Integer>{

    Route findDistinctByRouteNumber(Integer routeNumber);

}

package com.ting.tingServer.Controller.FareSystems.Bus.Regular;

import com.ting.tingServer.Controller.jsonResponseFormats.UpdateTimeTable;
import com.ting.tingServer.DAO.Entities.Route;
import com.ting.tingServer.DAO.Entities.TravelCard;
import com.ting.tingServer.DAO.Entities.Traveler;
import com.ting.tingServer.DAO.Repos.RouteRepo;
import com.ting.tingServer.DAO.Repos.TravelCardRepository;
import com.ting.tingServer.Model.CreditSystem.TransportAccount;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/FareSystems/Bus/Regular")
public class FareSystemController {

    @Autowired
    private TravelCardRepository travelCardRepository;

    @Autowired
    private RouteRepo routeRepo;

    @PostMapping(path="/updateSchedule/{route}")
    public @ResponseBody
    ResponseEntity  updateSchedule(@PathVariable("route") String route, @RequestBody UpdateTimeTable updateTimeTable)
    {

        return new ResponseEntity(HttpStatus.OK) ;
    }

    @PostMapping(path="/travelerEligibleForJourney/{travelCardID}/{route}")
        public @ResponseBody
    ResponseEntity travelerEligibleForJourney(@PathVariable("route") int route, @PathVariable("travelCardID") String travelCardID) {


            //Check If the
            TravelCard travelCard = travelCardRepository.findDistinctByTravelCardIDEquals(travelCardID);
            //Get Traveler Details
            Traveler traveler = travelCard.getTraveler();
            //Get Account Balance
            TransportAccount transportAccount = new TransportAccount(traveler);

            //Grab All Events
            Double balance = Double.valueOf(transportAccount.getBalance());

            //Grab Max Charge For The Route, The Credit Balance should have at least the max charge of the Route
            Route route1 = routeRepo.findDistinctByRouteNumber(route);
            Integer maxCharge = route1.getMaxCharge();

            System.out.println(balance + ">=" + maxCharge + " TA " + transportAccount.getBalance());

            if(maxCharge <= balance)
            {
                return new ResponseEntity(HttpStatus.OK);
            }
            else {
                return new ResponseEntity(HttpStatus.NOT_FOUND);
            }



    }

}

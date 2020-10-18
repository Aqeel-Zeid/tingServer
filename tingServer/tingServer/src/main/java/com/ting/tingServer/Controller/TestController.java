package com.ting.tingServer.Controller;

import com.ting.tingServer.Controller.jsonResponseFormats.TestGETResponse;
import com.ting.tingServer.DAO.Entities.Route;
import com.ting.tingServer.DAO.Entities.TravelCard;
import com.ting.tingServer.DAO.Entities.Traveler;
import com.ting.tingServer.DAO.Repos.CreditEventRepo;
import com.ting.tingServer.DAO.Repos.RouteRepo;
import com.ting.tingServer.DAO.Repos.TravelCardRepository;
import com.ting.tingServer.DAO.Repos.TravelerRepository;
import com.ting.tingServer.Model.CreditSystem.CreditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    TravelerRepository travelerRepository;

    @Autowired
    CreditEventRepo creditEventRepo;

    @Autowired
    RouteRepo routeRepo;

    @Autowired
    TravelCardRepository travelCardRepository;

    @GetMapping(path="/testGET")
    public @ResponseBody
    String testController(@RequestBody TestGETResponse testGETResponse) {
        // This returns a JSON or XML with the users





        Traveler traveler1 = new Traveler();
        traveler1.setName("Zeid");
        traveler1.setEmail("aqeelaqeelzeid@gmail.com");
        traveler1.setDistrict("Kandy");
        traveler1.setNic("973291963v");
        traveler1.setPassword("1234");
        traveler1.setPhoneNumber("0764619998");

        //Create a Traveler
        travelerRepository.save(traveler1);
        //Create A Card

        traveler1.setId(1);

        TravelCard travelCard = new TravelCard();
        travelCard.setPin((double) 1234);
        travelCard.setTravelCardID("KDY-000-001");
        travelCard.setTraveler(traveler1);

        travelCardRepository.save(travelCard);
        //Join Traveler and Card

        //Create Route
        Route route = new Route();
        route.setMaxCharge(350);
        route.setRouteNumber(1);
        routeRepo.save(route);


        //Create Credit Events
        CreditEvent creditEvent = new CreditEvent();
        creditEvent.setTraveler(traveler1);
        creditEvent.setAmount((double) 400);
        creditEvent.setDescription("ONLINE TOP UP ");
        creditEvent.setFinalBalance(400);
        //creditEvent.setTimeStamp();
        //

        return "Test Param = " + testGETResponse.getTestParam();
    }
}

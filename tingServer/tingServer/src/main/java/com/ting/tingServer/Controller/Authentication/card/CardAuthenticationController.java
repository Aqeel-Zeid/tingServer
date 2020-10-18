package com.ting.tingServer.Controller.Authentication.card;


import com.ting.tingServer.Controller.jsonResponseFormats.PinAuthenticationResponse;
import com.ting.tingServer.DAO.Entities.TravelCard;
import com.ting.tingServer.DAO.Repos.TravelCardRepository;
import com.ting.tingServer.Model.Authentication.PINAuthenticationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/authentication/card")
public class CardAuthenticationController {

    @Autowired
    TravelCardRepository travelCardRepository;

    @PostMapping (path="/PINAuth")
    public @ResponseBody
    ResponseEntity pinAuthentication(@RequestBody PinAuthenticationResponse pinAuthenticationResponse) {
        //
        try {

            //Get Travel Card ID
            PINAuthenticationStrategy pinAuthenticationStrategy = new PINAuthenticationStrategy();
            pinAuthenticationStrategy.setPin(pinAuthenticationResponse.getPin());
            TravelCard travelCard = pinAuthenticationStrategy.authenticate();

            if(travelCard != null)
            {
                return new ResponseEntity(HttpStatus.OK);
            }
            else {
                return new ResponseEntity(HttpStatus.NOT_FOUND);
            }


        }catch (Exception e)
        {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }



}

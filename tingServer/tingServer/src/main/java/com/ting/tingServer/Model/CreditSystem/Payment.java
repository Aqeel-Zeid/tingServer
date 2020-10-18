package com.ting.tingServer.Model.CreditSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Payment {

    TransportAccount transportAccount;
    Float Amount;

    abstract void createCreditCount();
    abstract boolean validate();
    //Commit the payment details to the Device
    abstract void commit();
    public void makePayment()
    {
        Logger logger = LoggerFactory.getLogger(Payment.class);
        if(validate())
        {
            createCreditCount();
            commit();
            logger.info("Payment Made Successfully");
        }else {
            logger.info("Invalid Payment");
        }
    }
}

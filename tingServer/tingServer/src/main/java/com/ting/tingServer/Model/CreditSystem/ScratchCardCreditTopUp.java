package com.ting.tingServer.Model.CreditSystem;

public class ScratchCardCreditTopUp extends Payment{
    @Override
    void createCreditCount() {
        
    }

    @Override
    boolean validate() {
        return false;
    }

    @Override
    void commit() {

    }
}

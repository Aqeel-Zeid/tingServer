package com.ting.tingServer.Model.FareSystems;

public abstract class FareSystem {

    public String name;
    public int  mainVersion;
    public int subVersion;

    public abstract Float calculateFare();

}

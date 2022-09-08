package com.project;

public class FlightData {
    public int fid;
    public String flightName;
    public String source;
    public String destination;
    public String departureTime;
    public String arrivalTime;

    public FlightData(int fid,String flightName, String source, String destination, String departureTime, String arrivalTime) {
        this.flightName = flightName;
        this.fid = fid;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}

package com.project.Admin;

import com.project.BasicFunc;
import com.project.FlightData;
import com.project.Ticket;

public class AdminFunc implements BasicFunc {

    public FlightData[] flightList = new FlightData[100];

    public Ticket[] bookedTicket = new Ticket[100];

    static int bind=0;
    static int ind = 0;
    @Override
    public boolean login(String name, String pass) {
        if(name.equals("admin") && pass.equals("admin"))
        {
            return true;
        }
        return false;
    }

    public void addFlight(String flightName, String source, String destination, String departureTime, String arrivalTime)
    {
        FlightData fd = new FlightData(ind,flightName,source,destination,departureTime,arrivalTime);
        flightList[ind++]=fd;
    }

    public void viewFlight()
    {
        System.out.println("Flight ID\t\tFlight Name\t\tSource\t\tDestination\t\tDeparture Time\t\tArrival Time");
        for(int i=0;i<ind;i++)
        {
            System.out.println(flightList[i].fid+"\t\t"+flightList[i].flightName+"\t\t"+flightList[i].source+"\t\t"+flightList[i].destination+"\t\t"+flightList[i].departureTime+"\t\t"+flightList[i].arrivalTime);
        }
    }

//    void bookTicket(int id){
//        for(int i=0;i<ind;i++)
//        {
//            if(flightList[i].fid==id)
//            {
//                Ticket(id,flightList[i].flightName)
//            }
//        }
//    }
}

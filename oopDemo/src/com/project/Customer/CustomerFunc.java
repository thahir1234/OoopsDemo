package com.project.Customer;

import com.project.BasicFunc;

public class CustomerFunc implements BasicFunc {

    customerData[] customerList = new customerData[100];
    static int ind=0;
    @Override
    public boolean login(String name,String pass)
    {

        for(customerData cd:customerList)
        {
            if(cd.getUname().equals(name))
            {
                if(cd.getPass().equals(pass))
                {
                    System.out.println("*** Login Successfull ***");
                    return true;
                }
            }
        }
        return false;
    }
    public void Register(String name,String pass,int age,String country)
    {
        customerData cusObj = new customerData(name,pass,age,country);
        customerList[ind++]=cusObj;
        System.out.println("*** Register Successfull");
    }

    public void bookTicket()
    {

    }
}

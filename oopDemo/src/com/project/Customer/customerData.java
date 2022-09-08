package com.project.Customer;

import com.project.UserData;

public class customerData extends UserData {

    static int cid;
    int age;
    String country;

    customerData(String uname,String pass,int age,String country)
    {
        super(cid,uname,pass);
        this.age = age;
        this.country = country;
        cid++;
    }

}

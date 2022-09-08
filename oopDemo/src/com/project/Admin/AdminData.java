package com.project.Admin;

import com.project.UserData;

public class AdminData extends UserData {
    static int aid;
    String team;

    AdminData(String uname,String pass,String team)
    {
        super(aid,uname,pass);
        this.team= team;
        aid++;
    }
}

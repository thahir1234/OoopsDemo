package com.project;

public class UserData {
    int id;
    protected String uname;
    protected String pass;

    protected UserData(int id,String uname,String pass)
    {
        this.id = id;
        this.uname= uname;
        this.pass= pass;
    }

    public String getUname()
    {
        return this.uname;
    }

    public String getPass()
    {
        return this.pass;
    }
}

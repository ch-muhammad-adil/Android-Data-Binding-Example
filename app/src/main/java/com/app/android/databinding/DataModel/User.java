package com.app.android.databinding.DataModel;

/**
 * Created by Adil on 30/10/2015.
 */
public class User {
    String name;
    String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package com.example.mypc.manhquyen.tablelayout;

/**
 * Created by MyPC on 16/02/2017.
 */

public class Restaurant {
    public static  final String TYPE_SIT_DOWN="sit_down";
    private String name="";
    private String address="";
    private String type="";
    private String discount="";

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }


    public String getName() {
        return(name);
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getAddress() {
        return(address);
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public String getType() {
        return(type);
    }
    public void setType(String type) {
        this.type=type;
    }
}
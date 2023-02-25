package com.driver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Order {

    private String id;
    private int deliveryTime;

    Calendar calendar = Calendar.getInstance();



    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id = id;
        int hours = 0;
        int min = 0;
        try {
            SimpleDateFormat format = new SimpleDateFormat("H:m");
            Date date = format.parse("15:34");
            hours = date.getHours();
            min = date.getMinutes();
        } catch (ParseException e) {
            System.out.println(e);
        }

        this.deliveryTime = hours * 60 + min;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}

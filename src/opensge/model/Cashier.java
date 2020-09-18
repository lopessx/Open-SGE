/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensge.model;

import java.util.Calendar;
import java.util.Locale;






/**
 *
 * @author emanuel
 */
public class Cashier {
    
    //Attributes
    private int id;
    private Calendar date = Calendar.getInstance(Locale.getDefault(Locale.Category.DISPLAY));
    private double earnigsDay;

    //Constructor
    public Cashier() {
    }

    //Getters
    public Calendar getDate() {
        return date;
    }

    public double getEarnigsDay() {
        return earnigsDay;
    }

    public int getId() {
        return id;
    }

    //Setters
    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setEarnigsDay(double earnigsDay) {
        this.earnigsDay = earnigsDay;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}

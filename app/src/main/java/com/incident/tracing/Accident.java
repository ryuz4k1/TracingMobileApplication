package com.incident.tracing;

import android.support.v7.app.AppCompatCallback;

/**
 * Created by L on 9.4.2018.
 */

public class Accident {

    private String name;
    private String description;
    private int imageResourceID;

    //accidents is an array of Accidents
    public static final Accident[] accidents = {
            new Accident("Accident at work claims", "Although you make think your work environment is safe, hazards present themselves all of the time in the workplace. Of course, some locations see accidents more frequently than others – with factories and building sites being more risky than offices for example. However, nowhere is completely without its risks.",
                    R.drawable.latte),
            new Accident("Road accident claims", "The roads are a congested and dangerous place to be, and while you may believe that you are a very safe driver, or have a car with the very best protective technology, unfortunately there are many other drivers who do not take the same levels of care when on the road.",
                    R.drawable.cappuccino),
            new Accident("Medical negligence claims", "The health system in the UK is, fortunately, at a very high standard and our medical professionals are well qualified to perform all sorts of complex procedures. However, these are occasions when things can go wrong, resulting in devastating injuries for the victims." ,
                    R.drawable.filter),
            new Accident("Slip or trip accident claims","These are one of the most commonly claimed-for accidents due to the sheer number of hazards that we face just by stepping outside the door every day. Whether it’s tripping over an uneven pavement, or slipping over on a wet floor in the local supermarket, you need to consider whether someone else is liable for the injuries they have caused you.",
                    R.drawable.mocha)
    };

    public Accident(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public String toString() { return this.name; }
}

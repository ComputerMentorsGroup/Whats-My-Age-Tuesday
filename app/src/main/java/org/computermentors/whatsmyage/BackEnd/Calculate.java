package org.computermentors.whatsmyage.BackEnd;

import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by CryoFlar3 on 2/9/16.
 */
public class Calculate {

    // Converts the DatePicker to a Date variable.
    public Date getDate (DatePicker date){
        Date newDate = new Date(date.getYear() - 1900, date.getMonth(), date.getDayOfMonth());

        return newDate;
    }

    // Calculates the age of the user.
    public int getAge (Date date){

        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
            age--;
        } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
            age--;
        }


        return age;
    }
}

package org.computermentors.whatsmyage;

import android.widget.DatePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by CryoFlar3 on 2/9/16.
 */
public class Calculate {

    Date getDate (DatePicker date){

        return null;
    }

    int getAge (Date date){

        String dateString = "20160211";

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));

        System.out.println(cal.getTime());

        return 0;
    }


}

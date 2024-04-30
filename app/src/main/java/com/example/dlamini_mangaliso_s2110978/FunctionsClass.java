/**
 *
 * @author Mangaliso Linda Dlamini S2110978
 */
package com.example.dlamini_mangaliso_s2110978;

import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import android.widget.ImageView;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionsClass {

    public void setLocation(TextView city, TextView country, int i){
        switch (i){
            case 0:
                city.setText("Glasgow");
                country.setText("Scotland");
                break;
            case 1:
                city.setText("London");
                country.setText("England");
                break;
            case 2:
                city.setText("New York");
                country.setText("USA");
                break;
            case 3:
                city.setText("Muscat");
                country.setText("Oman");
                break;
            case 4:
                city.setText("Port Louis");
                country.setText("Mauritius");
                break;
            case 5:
                city.setText("Dhaka");
                country.setText("Bangladesh");
                break;

        }
    }
    public void SetWeatherIcon(ImageView iv, String conditions){
        switch (conditions){
            case "Sunny":
                iv.setImageResource(R.drawable.day_clear);
                break;
            case "Sunny Intervals":
                iv.setImageResource(R.drawable.day_partial_cloud);
                break;
            case "Clear Sky":
                iv.setImageResource(R.drawable.night_clear);
                break;
            case "Light Rain Shower":
                iv.setImageResource(R.drawable.rain);
                break;
            case "Mist":
                iv.setImageResource(R.drawable.mist);
                break;
            case "Fog":
                iv.setImageResource(R.drawable.fog);
                break;
            case "Light Rain":
                iv.setImageResource(R.drawable.rain);
                break;
            case "Heavy Rain":
                iv.setImageResource(R.drawable.rain);
                break;
            case "Light Cloud":
                iv.setImageResource(R.drawable.day_partial_cloud);
                break;
            case "Thundery Shower":
                iv.setImageResource(R.drawable.rain);
                break;
            default:
                iv.setImageResource(R.drawable.overcast);
                break;

        }
    }

    public String timeFormatter(String zuluTimeString ){
        //String zuluTimeString = "2024-04-30T12:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date zuluTime = null;
        try {
            zuluTime = sdf.parse(zuluTimeString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Convert Zulu time to local time
        SimpleDateFormat localDateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm");
        localDateFormat.setTimeZone(TimeZone.getDefault()); // Use the device's default time zone

        return localDateFormat.format(zuluTime);

    }
}

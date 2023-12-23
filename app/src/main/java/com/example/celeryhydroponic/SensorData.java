package com.example.celeryhydroponic;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;  // Import AppCompatActivity

@SuppressWarnings("unused")  // Suppress the warning about the class not being used
public class SensorData {

    private String date;
    private float temperature;
    private float humidity;

    public SensorData(String date, float temperature, float humidity) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getDate() {
        return date;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}

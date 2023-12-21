package com.example.celeryhydroponic;
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


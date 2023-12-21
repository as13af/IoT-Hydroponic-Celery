package com.example.celeryhydroponic;
public class SensorDataHolder {
    private static float temperature;
    private static float humidity;
    private static String condition;

    public static float getTemperature() {
        return temperature;
    }

    public static void setTemperature(float temperature) {
        SensorDataHolder.temperature = temperature;
    }

    public static float getHumidity() {
        return humidity;
    }

    public static void setHumidity(float humidity) {
        SensorDataHolder.humidity = humidity;
    }

    public static String getCondition() {
        return condition;
    }

    public static void setCondition(String condition) {
        SensorDataHolder.condition = condition;
    }
}


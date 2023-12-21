package com.example.celeryhydroponic;
import cc.blynk.client.BlynkAndroidClient;
import cc.blynk.client.BlynkSocket;

public class BlynkManager {
    private static BlynkAndroidClient blynk;

    public static void initialize(String authToken) {
        blynk = new BlynkAndroidClient(new BlynkSocket());
        blynk.begin(authToken);
    }

    public static BlynkAndroidClient getBlynk() {
        return blynk;
    }
}


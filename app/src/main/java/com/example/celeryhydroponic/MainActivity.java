package com.example.celeryhydroponic;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cc.blynk.Blynk;
import cc.blynk.BlynkState;
import cc.blynk.IBlynk;

public class MainActivity extends AppCompatActivity {

    private TextView temperatureTextView, phTextView, humidityTextView, growthTextView;
    private Blynk blynk;
    private UltrasonicSensor ultrasonicSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperatureTextView = findViewById(R.id.temperatureTextView);
        phTextView = findViewById(R.id.phTextView);
        humidityTextView = findViewById(R.id.humidityTextView);
        growthTextView = findViewById(R.id.growthTextView);

        // Initialize Blynk
        blynk = new Blynk(new IBlynk() {
            @Override
            public void notifyConnectionEstablished() {
                // Called when the connection to the Blynk server is established
            }

            @Override
            public void notifyConnectionLost() {
                // Called when the connection to the Blynk server is lost
            }

            @Override
            public void notifyState(BlynkState blynkState) {
                // Called when the Blynk state changes (CONNECTING, CONNECTED, etc.)
            }
        });

        // Set your Blynk authentication token
        String authToken = "your_auth_token";
        blynk.begin(authToken);

        // Initialize Ultrasonic Sensor
        ultrasonicSensor = new UltrasonicSensor(new UltrasonicSensor.OnDistanceChangeListener() {
            @Override
            public void onDistanceChanged(float distance) {
                // Handle distance change (celery growth)
                growthTextView.setText("Celery Growth: " + distance + " cm");
                // You may want to send this data to Blynk or perform other actions based on the growth.
            }
        });

        // TODO: Add code to read data from other sensors and update UI
    }

    private void sendSensorDataToBackend(String sensorType, float sensorValue) {
        new Thread(() -> {
            try {
                OkHttpClient client = new OkHttpClient();

                String url = "http://your-backend-url/api/sensor-data";
                String json = String.format("{\"type\": \"%s\", \"value\": %f}", sensorType, sensorValue);

                RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
                Request request = new Request.Builder()
                        .url(url)
                        .post(body)
                        .build();

                Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    // Sensor data sent successfully
                    // You can handle the response if needed
                } else {
                    // Handle failure
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}

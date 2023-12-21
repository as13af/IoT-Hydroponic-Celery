package com.example.celeryhydroponic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import cc.blynk.client.BlynkAndroidClient;
import cc.blynk.client.BlynkSocket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView dateTextView;
    private TextView temperatureTextView;
    private TextView humidityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_data);

        dateTextView = findViewById(R.id.dateTextView);
        temperatureTextView = findViewById(R.id.temperatureTextView);
        humidityTextView = findViewById(R.id.humidityTextView);

        // Check for network connectivity
        if (NetworkUtils.isNetworkAvailable(this)) {
            // Fetch sensor data
            SensorData sensorData = DataFetcher.fetchSensorData();

            // Display sensor data in UI
            displaySensorData(sensorData);
        } else {
            // Notify the user about no internet connectivity
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
        }
    }

    private void displaySensorData(SensorData sensorData) {
        dateTextView.setText("Date: " + sensorData.getDate());
        temperatureTextView.setText("Temperature: " + sensorData.getTemperature() + "°C");
        humidityTextView.setText("Humidity: " + sensorData.getHumidity() + "%");
    }
}


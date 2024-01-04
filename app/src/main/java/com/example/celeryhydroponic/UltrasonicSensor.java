package com.example.celeryhydroponic;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;  // Add this import
import androidx.appcompat.app.AppCompatActivity;

public class UltrasonicSensor extends AppCompatActivity {

    private TextView distanceTextView;
    private OnDistanceChangeListener listener;

    public interface OnDistanceChangeListener {
        void onDistanceChanged(float distance);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultrasonic_sensor);

        distanceTextView = findViewById(R.id.distanceTextView);

        // Initialize your Ultrasonic Sensor here (use appropriate library or code).
        // You might need to set up GPIO pins, provide power, etc.
        // Register a listener or use a loop to periodically measure the distance.

        // Additional initialization code for your UltrasonicSensor activity
    }

    // Example method to simulate distance change (replace this with actual sensor reading)
    private float simulateDistanceChange() {
        // Simulate a change in distance (celery growth)
        return (float) (Math.random() * 10); // Replace with actual sensor reading
    }

    // Example method to trigger distance change listener
    private void notifyDistanceChange(float distance) {
        if (listener != null) {
            listener.onDistanceChanged(distance);
        }
    }

    // Example method to be called periodically (replace this with actual sensor reading)
    public void measureDistance() {
        float distance = simulateDistanceChange(); // Replace with actual sensor reading
        notifyDistanceChange(distance);
    }
}

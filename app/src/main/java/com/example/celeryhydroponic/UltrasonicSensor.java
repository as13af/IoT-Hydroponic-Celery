public class UltrasonicSensor {
    public interface OnDistanceChangeListener {
        void onDistanceChanged(float distance);
    }

    private OnDistanceChangeListener listener;

    public UltrasonicSensor(OnDistanceChangeListener listener) {
        this.listener = listener;
        // Initialize your Ultrasonic Sensor here (use appropriate library or code).
        // You might need to set up GPIO pins, provide power, etc.
        // Register a listener or use a loop to periodically measure the distance.
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

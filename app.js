const express = require("express");
const bodyParser = require("body-parser");

const app = express();
const port = process.env.PORT || 3000;

// Middleware to parse JSON requests
app.use(bodyParser.json());

// Endpoint to receive sensor data
app.post("/api/sensor-data", (req, res) => {
  const sensorData = req.body;
  // Process sensor data as needed
  console.log("Received Sensor Data:", sensorData);
  res.json({ success: true, message: "Sensor data received successfully." });
});

// Endpoint to provide celery growth information
app.get("/api/celery-growth", (req, res) => {
  // Retrieve and provide celery growth information
  const celeryGrowth = 15.7; // Replace with actual celery growth data
  res.json({ celeryGrowth });
});

// Start the server
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});

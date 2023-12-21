package com.example.celeryhydroponic;
// Your package and import statements here

public class TemperatureActivity extends AppCompatActivity {

    private TableLayout temperatureTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        temperatureTable = findViewById(R.id.temperatureTable);

        // Add sample data to the temperature table (replace with your actual data)
        addRowToTemperature("2023-12-01", "25°C");
        addRowToTemperature("2023-12-02", "24°C");
        addRowToTemperature("2023-12-03", "26°C");
    }

    private void addRowToTemperature(String date, String temperature) {
        TableRow row = new TableRow(this);

        TextView dateTextView = new TextView(this);
        dateTextView.setText(date);
        dateTextView.setPadding(16, 8, 16, 8);
        row.addView(dateTextView);

        TextView temperatureTextView = new TextView(this);
        temperatureTextView.setText(temperature);
        temperatureTextView.setPadding(16, 8, 16, 8);
        row.addView(temperatureTextView);

        temperatureTable.addView(row);
    }
}


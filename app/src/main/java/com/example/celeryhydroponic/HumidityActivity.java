package com.example.celeryhydroponic;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HumidityActivity extends AppCompatActivity {

    private TableLayout humidityTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidity);

        humidityTable = findViewById(R.id.humidityTable);

        // Add sample data to the humidity table (replace with your actual data)
        addRowToHumidity("2023-12-01", "60%");
        addRowToHumidity("2023-12-02", "58%");
        addRowToHumidity("2023-12-03", "62%");
    }

    private void addRowToHumidity(String date, String humidity) {
        TableRow row = new TableRow(this);

        TextView dateTextView = new TextView(this);
        dateTextView.setText(date);
        dateTextView.setPadding(16, 8, 16, 8);
        row.addView(dateTextView);

        TextView humidityTextView = new TextView(this);
        humidityTextView.setText(humidity);
        humidityTextView.setPadding(16, 8, 16, 8);
        row.addView(humidityTextView);

        humidityTable.addView(row);
    }
}

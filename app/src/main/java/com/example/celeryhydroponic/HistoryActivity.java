package com.example.celeryhydroponic;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    private TableLayout historyTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        historyTable = findViewById(R.id.historyTable);

        // Add sample data to the history table (replace with your actual data)
        addRowToHistory("2023-12-01", "25°C", "60%");
        addRowToHistory("2023-12-02", "24°C", "58%");
        addRowToHistory("2023-12-03", "26°C", "62%");
    }

    private void addRowToHistory(String date, String temperature, String humidity) {
        TableRow row = new TableRow(this);

        TextView dateTextView = new TextView(this);
        dateTextView.setText(date);
        dateTextView.setPadding(16, 8, 16, 8);
        row.addView(dateTextView);

        TextView temperatureTextView = new TextView(this);
        temperatureTextView.setText(temperature);
        temperatureTextView.setPadding(16, 8, 16, 8);
        row.addView(temperatureTextView);

        TextView humidityTextView = new TextView(this);
        humidityTextView.setText(humidity);
        humidityTextView.setPadding(16, 8, 16, 8);
        row.addView(humidityTextView);

        historyTable.addView(row);
    }
}


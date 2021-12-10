package com.babin.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =(TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Worked", Toast.LENGTH_SHORT).show();

    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void zero(View view) {
        mShowCount.setText("0");
        zero = findViewById(R.id.zero);
        zero.setBackgroundColor(getResources().getColor(R.color.purple_200));

    }
    }
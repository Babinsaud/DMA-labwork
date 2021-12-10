package com.babin.activitycyclehomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCount;
    TextView countText;
    public int count=0;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCount = findViewById(R.id.count);
        countText=findViewById(R.id.showcount);
        editText=findViewById(R.id.button_text);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                countText.setText(count+"");
            }
        });

        if(savedInstanceState!=null){
            countText.setText(savedInstanceState.getString("countValue"));
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("countValue",countText.getText().toString());
    }

}
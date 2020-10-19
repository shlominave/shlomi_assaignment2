package com.example.shlomi_assaignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int cnt=0;
TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV=findViewById(R.id.txtResult);

    }

    public void OnClick(View view) {
        cnt++;
        String str=getString(R.string.textOnTextBox);
        TV.setText(str+ " "+ cnt);
    }
}
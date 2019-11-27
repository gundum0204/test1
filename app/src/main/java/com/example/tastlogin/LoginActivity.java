package com.example.tastlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    String getNameString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        getNameString = getIntent().getStringExtra("Name");
        TextView tvt1 = findViewById(R.id.tvt);
        tvt1.setText("ยินดีต้อนรับ"+getNameString);








    }
}

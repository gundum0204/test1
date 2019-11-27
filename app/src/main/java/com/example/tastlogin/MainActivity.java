package com.example.tastlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String nameString;
    String passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = findViewById(R.id.edt1);
        final EditText editText2 = findViewById(R.id.edt2);
        Button button1 = findViewById(R.id.bt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = editText1.getText().toString();
                passWord = editText2.getText().toString();
                if (nameString.length() == 0 && passWord.length() == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ข้อมูลทุกข้อ.", Toast.LENGTH_SHORT).show();
                } else if (passWord.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "ยินดีต้อนรับคุณ " + nameString + "เข้าสู่เกม", Toast.LENGTH_SHORT).show();
                    Intent startIntent = new Intent(MainActivity.this,LoginActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "Password ไม่ถูกต้อง กรุณาใส่ข้อมูลใหม่",Toast.LENGTH_SHORT).show();
                }
            }







        });

    }//end
}//end

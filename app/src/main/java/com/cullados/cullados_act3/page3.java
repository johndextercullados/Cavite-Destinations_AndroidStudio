package com.cullados.cullados_act3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //GOING BACK TO MAIN PAGE/FIRSTPAGE
        Button btnfirstpage = findViewById(R.id.btn_go_to_Firstpage);

        btnfirstpage.setOnClickListener(new View.OnClickListener() { //THIS IS WHAT WILL HAPPEN
            @Override
            public void onClick(View v) {
                //TOH UNG INTENT, PARA PUMUNTA SA PAGE 2
                Intent intent = new Intent(page3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //GOING TO PAGE 4
        Button btnfourthpage = findViewById(R.id.btn_go_to_4thpage);

        btnfourthpage.setOnClickListener(new View.OnClickListener() { //THIS IS WHAT WILL HAPPEN
            @Override
            public void onClick(View v) {
                //TOH UNG INTENT, PARA PUMUNTA SA PAGE 2
                Intent intent = new Intent(page3.this, page4.class);
                startActivity(intent);
            }
        });


    }
}
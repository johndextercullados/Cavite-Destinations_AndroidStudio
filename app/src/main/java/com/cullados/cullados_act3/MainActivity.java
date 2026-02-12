package com.cullados.cullados_act3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //GOING TO PAGE 2
        Button btnsecondpage = findViewById(R.id.btn_go_to_2ndpage);

        btnsecondpage.setOnClickListener(new View.OnClickListener() { //THIS IS WHAT WILL HAPPEN
            @Override
            public void onClick(View v) {
                //TOH UNG INTENT, PARA PUMUNTA SA PAGE 2
                Intent intent = new Intent(MainActivity.this, page2.class);
                startActivity(intent);
            }
        });
    }
}

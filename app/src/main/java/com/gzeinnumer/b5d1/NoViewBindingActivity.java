package com.gzeinnumer.b5d1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NoViewBindingActivity extends AppCompatActivity {

    //deklarasi
    Button btnClickMe;
    TextView tvExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_view_binding);

        btnClickMe = findViewById(R.id.btn_click_me);
        tvExample = findViewById(R.id.tv_example);

        //using/consume
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvExample.setText("Eh Keganti!!!!");
            }
        });
    }
}
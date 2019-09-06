package com.regadeveloper.testdlu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private Button btnHasil;
    private TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("shu", MainActivity.class.getSimpleName()+" onCreate");
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnHasil = findViewById(R.id.btnHasil);
        tvHasil = findViewById(R.id.tvHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shu", MainActivity.class.getSimpleName()+" onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shu", MainActivity.class.getSimpleName()+" onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shu", MainActivity.class.getSimpleName()+" onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shu", MainActivity.class.getSimpleName()+" onRestart");
    }
}

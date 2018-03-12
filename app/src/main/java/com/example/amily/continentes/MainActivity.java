package com.example.amily.continentes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText continente;
    public static final String CHAVE = "continentes.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void listarPaises(View view){
        Intent intent = new Intent(this, tela2.class);
        String chave = continente.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }
}

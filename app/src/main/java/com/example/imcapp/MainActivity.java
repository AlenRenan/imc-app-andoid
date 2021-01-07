package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botaoAbriOutraTela,botaoGeraIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botaoAbriOutraTela=findViewById(R.id.btnAbrirOutraTela);
        botaoAbriOutraTela.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent outraTela=new Intent(getApplicationContext(),TelaAposBotao.class);
                startActivity(outraTela);
            }
        });
    }
}
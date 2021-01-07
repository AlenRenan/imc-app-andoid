package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaAposBotao extends AppCompatActivity {

    Button botaoVoltar,botaoGeraIMC;
    private EditText editPeso;
    private EditText editAltura;
    private TextView editIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_apos_botao);
//Recupera os valores dos componentes de entrada nas interfaces
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        editIMC = findViewById(R.id.editIMC);
        botaoVoltar=findViewById(R.id.btnVoltar);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        botaoGeraIMC=findViewById(R.id.btnGeraImc);
        botaoGeraIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraOutraTela=new Intent(getApplicationContext(),telaDeResultado.class);
                startActivity(outraOutraTela);
            }
        });

    }
    public void calculoImc (View view){

        //converte de String para valores numericos
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        //Cálculo do Imc
        double imc = peso/(altura * altura);

        if (imc < 18.5){

            editIMC.setText("IMC= \nVocê está abaixo do seu peso"+imc);

        } else if (imc >= 18.5 && imc <= 24.9){

            editIMC.setText("IMC= \nVocê está com o seu peso normal"+imc);

        } else if (imc >= 25 && imc <= 29.9 ){

            editIMC.setText("IMC= \nVocê está com Sobrepeso"+imc);

        } else if (imc >= 30 && imc <= 34.9){

            editIMC.setText("IMC= \nVocê está com Obesidade Grau I"+imc);

        } else if (imc >= 35 && imc <= 39.9){

            editIMC.setText("IMC= \nVocê está com Obesidade Grau II"+imc);

        } else if (imc >= 40){

            editIMC.setText("IMC= \nVocê está com Obesidade Mórbida (grau III)\n"+imc);
        }

    }
}
package com.example.imc_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();//retira a barra azul
        setContentView(R.layout.activity_main);

        final TextView txt_Altura = (TextView) findViewById(R.id.txt_altura);
        final TextView txt_Peso = (TextView) findViewById(R.id.txt_peso);
        final TextView txt_Result = (TextView) findViewById(R.id.txt_result);

        final EditText edt_Altura = (EditText) findViewById(R.id.edt_altura);
        final EditText edt_Peso = (EditText) findViewById(R.id. edt_peso);

        final Button button = (Button)findViewById(R.id.btn_calcular);
        button.setOnClickListener (new View.OnClickListener(){
                                       public void onClick (View v){
/*
                                           if (edt_Peso.getText().toString().equals("") ){
                                               txt_Result.setText(R.string.dados_inc);
                                               edt_Peso.requestFocus();
                                           } else if(edt_Altura.getText().toString().equals("") ){
                                               txt_Result.setText(R.string.dados_inc);
                                               edt_Altura.requestFocus();
                                           }*/

                                           /*if (edt_Peso.getText().toString().trim().equals("") ){
                                               txt_Result.setText(R.string.dados_inc);
                                           }*/
                                           int peso = 0;
                                           peso = Integer.parseInt(edt_Peso.getText().toString());
                                           float altura = 0.0F;
                                           altura=  Float.parseFloat(edt_Altura.getText().toString());
                                           String txt_inc = getString(R.string.dados_inc);
                                           ;
                                           float resultado = 0.0F;


                                           resultado = peso / (altura * altura) * 10000;
                                           if (altura == 0){
                                               txt_Result.setText(txt_inc);

                                           }
                                           else if (resultado <= 0 ){
                                               txt_Result.setText(txt_inc);
                                           }

                                           else if(resultado >0 && resultado <18.5){
                                               txt_Result.setText(R.string.result_abaixo);

                                           }else if(resultado>=25 & resultado <=29.9 ){
                                               txt_Result.setText(R.string.result_normal);
                                           }else if (resultado >= 30 && resultado <= 39.9){
                                               txt_Result.setText(R.string.result_obesidade);
                                           }
                                           else if (resultado >40){
                                               txt_Result.setText(R.string.result_obesMorb);
                                           }

                                       }

                                   }

        );



    }
}
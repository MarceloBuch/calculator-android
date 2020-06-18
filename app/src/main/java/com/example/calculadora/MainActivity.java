package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num2;
    EditText num1;
    TextView result;
    Button btnSoma;
    Button btnSubtrair;
    Button btnMultiplicacao;
    Button btnDivisao;

    int n1,n2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.input_1num);
        num2=(EditText)findViewById(R.id.input_2num);
        result=(TextView)findViewById(R.id.output_result);
        btnSoma = (Button)findViewById(R.id.btnsoma);
        btnSubtrair=(Button)findViewById(R.id.btnsub);
        btnMultiplicacao=(Button)findViewById(R.id.btnmult);
        btnDivisao= (Button)findViewById(R.id.btndiv);

    }

        public void Soma(View View){
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            resultado = n1 + n2;
            result.setText(Integer.toString(resultado));
        }

        public void Subtrair(View View){
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            resultado = n1 - n2;
            result.setText(Integer.toString(resultado));
        }

        public void Multiplicar(View View) {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            resultado = n1 * n2;
            result.setText(Integer.toString(resultado));
        }

        public void Dividir(View View){
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            resultado = n1 / n2;
            result.setText(Integer.toString(resultado));
        }

    }


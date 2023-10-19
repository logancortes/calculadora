package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;
    private TextView txt_respuesta;
    private EditText numero_1;
    private EditText numero_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pasamos los números digitados por el usuario al método utilizado y guardamos su resultado en la caja de texto 'respuesta'
        //Se usa el +"" al final para que pase la respuesta a la caja de texto como string.

        btn_suma = findViewById(R.id.btnSuma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(suma(Integer.parseInt(numero_1.getText().toString()), Integer.parseInt(numero_2.getText().toString())) + "");
            }
        });

        btn_resta = findViewById(R.id.btnResta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(resta(Integer.parseInt(numero_1.getText().toString()), Integer.parseInt(numero_2.getText().toString())) + "");
            }
        });

        btn_multiplicacion = findViewById(R.id.btnMultiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(multiplicacion(Integer.parseInt(numero_1.getText().toString()), Integer.parseInt(numero_2.getText().toString())) + "");
            }
        });


        btn_division = findViewById(R.id.btnDivision);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_respuesta.setText(division(Integer.parseInt(numero_1.getText().toString()), Integer.parseInt(numero_2.getText().toString())) + "");
            }
        });

        txt_respuesta = findViewById(R.id.respuesta);

        numero_1 = findViewById(R.id.num1);
        numero_2 = findViewById(R.id.num2);
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {return a / b;}

}
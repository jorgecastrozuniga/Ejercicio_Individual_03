package com.example.ejercicio_individual_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conexion xml con java a traves de findViewid
        EditText Numero1 = findViewById(R.id.Numero1);
        EditText Numero2 = findViewById(R.id.Numero2);
        TextView Resultado = findViewById(R.id.Resultado);

        Button botonsumar = findViewById(R.id.botonsumar);
        Button botonrestar = findViewById(R.id.botonrestar);
        Button botonmultiplicar = findViewById(R.id.botonmultiplicar);
        Button botondividir = findViewById(R.id.botondividir);
        Button botoncerrar = findViewById(R.id.botoncerrar);

        // Proceso

        botonsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = Numero1.getText().toString();
                String num2 = Numero2.getText().toString();

                if (Numero1.getText().toString().isEmpty()) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else if (Numero2.getText().toString().isEmpty()) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else if (Numero1.getText().toString().isEmpty() && (Numero2.getText().toString().isEmpty())) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else {
                    int resul = Integer.parseInt(num1) + Integer.parseInt(num2);
                    Resultado.setText("El resultado es " + resul);
                    Numero1.setText("");
                    Numero2.setText("");
                }
            }
        });

        botonrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = Numero1.getText().toString();
                String num2 = Numero2.getText().toString();

                if (Numero1.getText().toString().isEmpty()) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else if (Numero2.getText().toString().isEmpty()) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else if (Numero1.getText().toString().isEmpty() && (Numero2.getText().toString().isEmpty())) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else {
                    int resul = Integer.parseInt(num1) - Integer.parseInt(num2);
                    Resultado.setText("El resultado es " + resul);
                    Numero1.setText("");
                    Numero2.setText("");
                }
            }
        });


        botondividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = Numero1.getText().toString();
                String num2 = Numero2.getText().toString();

                try {

                    if (Numero1.getText().toString().isEmpty()) {
                        Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                        mytoast.show();
                    } else if (Numero2.getText().toString().isEmpty()) {
                        Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                        mytoast.show();
                    } else if (Numero1.getText().toString().isEmpty() && (Numero2.getText().toString().isEmpty())) {
                        Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                        mytoast.show();
                    } else {
                        int resul = Integer.parseInt(num1) / Integer.parseInt(num2);
                        Resultado.setText("El resultado es " + resul);
                        Numero1.setText("");
                        Numero2.setText("");
                    }
                } catch (ArithmeticException e) {
                    Toast nocero = Toast.makeText(getApplicationContext(), "No se puede dividir por cero", Toast.LENGTH_LONG);
                    nocero.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    nocero.show();
                }
            }
        });


        botonmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = Numero1.getText().toString();
                String num2 = Numero2.getText().toString();

                if (Numero1.getText().toString().isEmpty()) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else if (Numero2.getText().toString().isEmpty()) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else if (Numero1.getText().toString().isEmpty() && (Numero2.getText().toString().isEmpty())) {
                    Toast mytoast = Toast.makeText(getApplicationContext(), "INGRESE LOS VALORES", Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                    mytoast.show();
                } else {
                    int resul = Integer.parseInt(num1) * Integer.parseInt(num2);
                    Resultado.setText("El resultado es " + resul);
                    Numero1.setText("");
                    Numero2.setText("");
                }
            }
        });

        botoncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

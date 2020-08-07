 package com.practica.practicaclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBoton1= findViewById(R.id.button);

        btnBoton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //que hago cuando aprieto en boton
                Toast.makeText(getApplicationContext(),"Test de App",Toast.LENGTH_LONG).show();
                //ahora para que el boton vaya a la segunda activity
                Intent intent = new Intent(getApplicationContext(), SegundaActividad.class);   // de donde, hacia donde va, los dos parametros son obligatorios
                startActivity(intent);

            }
        });
    }
}

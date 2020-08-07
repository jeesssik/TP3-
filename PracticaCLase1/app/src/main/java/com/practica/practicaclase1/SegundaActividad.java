package com.practica.practicaclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        Button btn = findViewById(R.id.button2);   //el id hace referencia al id del elemento que estamos llamando en esta pantalla
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);     //boton de la estrellita
        FloatingActionButton tel = findViewById(R.id.floatingActionButton2);   // boton del telefonito
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);   // de donde, hacia donde va, los dos parametros son obligatorios
                startActivity(intent);
            }
        });
        // para mandar un mail hardcodeado desde un boton
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Responder Urgente!!");
                intent.putExtra(Intent.EXTRA_TEXT,"esto es importante");
                intent.putExtra(Intent.EXTRA_EMAIL,"asd@gmail.com");

                intent.setType("plain/text");
                startActivity(Intent.createChooser(intent,"Elegi una opcion: "));
            }
        });
        // realizar una llamada a un numero hardcodeado desde un boton
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel:45710501");  // numero a llamar hardcodeado
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

    }
}

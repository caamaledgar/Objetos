package com.example.objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.objetos.Clases.Lavadora;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creando una instancia de nuestro objeto
        Lavadora lavadora   = new Lavadora();

        lavadora.setMarca("Mabe");
        lavadora.setModelo("Lavado Autómatico");

        Log.d("OBjeto lavadora", lavadora.toString());

    }
}

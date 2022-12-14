package com.example.objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.objetos.Clases.Lavadora;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //TextView textView;
    //Lavadora lavadora;
    //Lavadora lavadoraSecadora;

    //=  (TextView) findViewById(R.id.tvMensaje);
//    Lavadora lavadora   = new Lavadora();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String urlLogoPrincipal = "https://oasishoteles.com/blog/wp-content/uploads/2021/03/centro-campeche.jpg";
        ImageView ivLogo1 = (ImageView) findViewById(R.id.ivlogo1);
        ImageView ivLogo2 = (ImageView) findViewById(R.id.ivlogo2);



        //Creando una instancia de nuestro objeto
        Lavadora lavadora   = new Lavadora();
        lavadora.setMarca("Mabe");
        lavadora.setModelo("Lavado Autómatico");
        Log.d("Objeto lavadora", lavadora.toString());

        //Creando una segunda instancia de nuestro objeto
        Lavadora lavadoraSecadora = new Lavadora("IEM", "Secado Automático");
        Log.d("Objeto lavadora-Secadora", lavadoraSecadora.toString());

        //Realizar que los botones muestren en el TextView, los valores que tienen los objetos

        //Instanciar los objetos de nuestro XML
        TextView textView = (TextView) findViewById(R.id.tvMensaje);
        Button btnObjeto1 = (Button) findViewById(R.id.btnObjeto1);
        Button btnObjeto2 = (Button) findViewById(R.id.btnObjeto2);


        Glide.with(this)
                .load(urlLogoPrincipal)
                .error(getApplicationContext().getDrawable(android.R.drawable.presence_offline))
                .fitCenter()
                .circleCrop()
                .into(ivLogo1);

        urlLogoPrincipal = "https://blog.xcaret.com/es/wp-content/uploads/2014/06/portada-Blogs-1080x640.jpg";
        Glide.with(this)
                .load(urlLogoPrincipal)
                .error(getApplicationContext().getDrawable(android.R.drawable.presence_offline))
                .fitCenter()
                .circleCrop()
                .into(ivLogo2);


        btnObjeto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(lavadora.toString());
            }
        });

        btnObjeto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(lavadoraSecadora.toString());
            }
        });


    }


}

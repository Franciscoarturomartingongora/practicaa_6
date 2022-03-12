package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=(ListView) findViewById(R.id.listasistemasolar);
        String[] nombre = {"Sol"};
        String[] nombre2 = {"Mercurio" };

        String[] descripcion = {"El Sol es una estrella de tipo-G de la secuencia principal y clase de luminosidad",
                "Se conoce como el “planeta de hierro” debido a que su composición es rica en este elemento químico ",
                "Venus es un planeta rocoso con un tamaño y composición similar a la Tierra",
                "La Tierra es el tercer planeta orbitando alrededor del Sol.",
                "es el cuarto planeta orbitando alrededor del Sol. Es conocido también como “el planeta rojo”",
                "Es el planeta más grande del sistema solar",
                "Conocido por los siete anillos que lo rodean, ",
                "es un planeta gaseoso compuesto por gas metano en mayor proporción",

        };
        Integer[] idimagenes = {R.drawable.sol,R.drawable.merrcurio, R.drawable.veenus, R.drawable.tieerra,R.drawable.marte,R.drawable.jupiter,R.drawable.saturno,R.drawable.urano};
        AdapterListSolar adaptador = new AdapterListSolar(this,nombre,descripcion,idimagenes);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, sol.class));

            }
        });

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre2 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, mercurio.class));

            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

              Toast.makeText(getApplicationContext(),"La Descripcion es : "+descripcion [i],Toast.LENGTH_LONG).show();
               return true;
           }
       });
    }
}
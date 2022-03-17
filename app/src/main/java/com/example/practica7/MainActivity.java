package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView l1,l2,l3,l4,l5,l6,l7,l8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView) findViewById(R.id.l1);
        l2=(ListView) findViewById(R.id.l2);
        l3=(ListView) findViewById(R.id.l3);
        l4=(ListView) findViewById(R.id.l4);
        l5=(ListView) findViewById(R.id.l5);
        l6=(ListView) findViewById(R.id.l6);
        l7=(ListView) findViewById(R.id.l7);
        l8=(ListView) findViewById(R.id.l8);

        String[] nombre = {"Sol"};
        String[] nombre2 = {"mercurio"};
        String[] nombre3 = {"venus"};
        String[] nombre4= {"tierra"};
        String[] nombre5= {"marte"};
        String[] nombre6= {"jupiter"};
        String[] nombre7= {"saturno"};
        String[] nombre8= {"urano"};
        String[] descripcion = {"El Sol es una estrella de tipo-G de la secuencia principal y clase de luminosidad"};
        String[] descripcion2 = {"Se conoce como el “planeta de hierro” debido a que su composición es rica en este elemento químico "};
        String[] descripcion3 = {"Venus es un planeta rocoso con un tamaño y composición similar a la Tierra"};
        String[] descripcion4 = {"La Tierra es el tercer planeta orbitando alrededor del Sol."};
        String[] descripcion5 =  {"es el cuarto planeta orbitando alrededor del Sol. Es conocido también como “el planeta rojo” " };
        String[] descripcion6 = {"Es el planeta más grande del sistema solar"};
        String[] descripcion7 =  { "Conocido por los siete anillos que lo rodean, "};
        String[] descripcion8 = {"es un planeta gaseoso compuesto por gas metano en mayor proporción"};




        Integer[] idimagenes = {R.drawable.sol};
        Integer[] idimagenes2 = {R.drawable.merrcurio};
        Integer[] idimagenes3 = {R.drawable.veenus};
        Integer[] idimagenes4 = {R.drawable.tieerra};
        Integer[] idimagenes5 = {R.drawable.marte};
        Integer[] idimagenes6 = {R.drawable.jupiter};
        Integer[] idimagenes7 = {R.drawable.saturno};
        Integer[] idimagenes8 = {R.drawable.urano};

        AdapterListSolar adaptador1 = new AdapterListSolar(this,nombre,descripcion,idimagenes);
        l1.setAdapter(adaptador1);

        AdapterListSolar adaptador2 = new AdapterListSolar(this,nombre2,descripcion2,idimagenes2);
        l2.setAdapter(adaptador2);

        AdapterListSolar adaptador3 = new AdapterListSolar(this,nombre3,descripcion3,idimagenes3);
        l3.setAdapter(adaptador3);

        AdapterListSolar adaptador4 = new AdapterListSolar(this,nombre4,descripcion4,idimagenes4);
        l4.setAdapter(adaptador4);

        AdapterListSolar adaptador5 = new AdapterListSolar(this,nombre5,descripcion5,idimagenes5);
        l5.setAdapter(adaptador5);

        AdapterListSolar adaptador6 = new AdapterListSolar(this,nombre6,descripcion6,idimagenes6);
        l6.setAdapter(adaptador6);

        AdapterListSolar adaptador7 = new AdapterListSolar(this,nombre7,descripcion7,idimagenes7);
        l7.setAdapter(adaptador7);

        AdapterListSolar adaptador8 = new AdapterListSolar(this,nombre8,descripcion8,idimagenes8);
        l8.setAdapter(adaptador8);


        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, sol.class));

            }
        });

        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre2 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, mercurio.class));

            }
        });

        l3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre3 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, venus.class));

            }
        });

        l4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre4 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, tierra.class));

            }
        });

        l5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre5 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, marte.class));

            }
        });

        l6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre6 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, jupiter.class));

            }
        });

        l7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre7 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, saturno.class));

            }
        });

        l8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Mencionaste : "+nombre8 [i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, urano.class));

            }
        });

    }
}
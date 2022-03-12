package com.example.practica7;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterListSolar extends ArrayAdapter <String> {
    private final Activity context;
    private final String[] nombre;
    private final String[] descripcion;
    private final Integer[] id_images;


    public AdapterListSolar(Activity context, String[] nombres, String[] precios, Integer[] id_images) {
        super(context,R.layout.item,nombres);
        this.context = context;
        this.nombre = nombres;
        this.descripcion = precios;
        this.id_images = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.nombre);
        TextView _precio = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre.setText(nombre[position]);
        _precio.setText(descripcion[position]);
        _imagen.setImageResource(id_images[position]);
        return itemView;
    }
}







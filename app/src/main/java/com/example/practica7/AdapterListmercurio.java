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

public class AdapterListmercurio  extends ArrayAdapter <String> {


    private final Activity context;
    private final String[] nombre2;
    private final String[] descripcion2;
    private final Integer[] id_images2;


    public AdapterListmercurio(Activity context, String[] nombres2, String[] descripcion2, Integer[] id_images) {
        super(context,R.layout.item,nombres2);
        this.context = context;
        this.nombre2 = nombres2;
        this.descripcion2 = descripcion2;
        this.id_images2 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre2 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion2 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre2.setText(nombre2[position]);
        _descripcion2.setText(descripcion2[position]);
        _imagen.setImageResource(id_images2[position]);
        return itemView;
    }
}

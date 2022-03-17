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

public class AdapterListurano extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombre8;
    private final String[] descripcion8;
    private final Integer[] id_images8;


    public AdapterListurano(Activity context, String[] nombres8, String[] descripcion8, Integer[] id_images) {
        super(context,R.layout.item,nombres8);
        this.context = context;
        this.nombre8 = nombres8;
        this.descripcion8 = descripcion8;
        this.id_images8 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre8 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion8 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre8.setText(nombre8[position]);
        _descripcion8.setText(descripcion8[position]);
        _imagen.setImageResource(id_images8[position]);
        return itemView;
    }
}


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

public class AdapterListmarte extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombre5;
    private final String[] descripcion5;
    private final Integer[] id_images5;


    public AdapterListmarte(Activity context, String[] nombres5, String[] descripcion5, Integer[] id_images) {
        super(context,R.layout.item,nombres5);
        this.context = context;
        this.nombre5 = nombres5;
        this.descripcion5 = descripcion5;
        this.id_images5 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre5 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion5 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre5.setText(nombre5[position]);
        _descripcion5.setText(descripcion5[position]);
        _imagen.setImageResource(id_images5[position]);
        return itemView;
    }
}

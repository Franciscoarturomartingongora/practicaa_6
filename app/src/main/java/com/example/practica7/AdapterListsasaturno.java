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

public class AdapterListsasaturno extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombre7;
    private final String[] descripcion7;
    private final Integer[] id_images7;


    public AdapterListsasaturno(Activity context, String[] nombres7, String[] descripcion7, Integer[] id_images) {
        super(context,R.layout.item,nombres7);
        this.context = context;
        this.nombre7 = nombres7;
        this.descripcion7 = descripcion7;
        this.id_images7 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre7 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion7 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre7.setText(nombre7[position]);
        _descripcion7.setText(descripcion7[position]);
        _imagen.setImageResource(id_images7[position]);
        return itemView;
    }
}

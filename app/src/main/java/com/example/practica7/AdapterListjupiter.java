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

public class AdapterListjupiter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombre6;
    private final String[] descripcion6;
    private final Integer[] id_images6;


    public AdapterListjupiter(Activity context, String[] nombres6, String[] descripcion6, Integer[] id_images) {
        super(context,R.layout.item,nombres6);
        this.context = context;
        this.nombre6 = nombres6;
        this.descripcion6 = descripcion6;
        this.id_images6 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre6 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion6 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre6.setText(nombre6[position]);
        _descripcion6.setText(descripcion6[position]);
        _imagen.setImageResource(id_images6[position]);
        return itemView;
    }
}

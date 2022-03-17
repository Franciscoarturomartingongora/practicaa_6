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

public class AdapterListvenus extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombre3;
    private final String[] descripcion3;
    private final Integer[] id_images3;


    public AdapterListvenus(Activity context, String[] nombres3, String[] descripcion3, Integer[] id_images) {
        super(context,R.layout.item,nombres3);
        this.context = context;
        this.nombre3 = nombres3;
        this.descripcion3 = descripcion3;
        this.id_images3 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre3 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion3 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre3.setText(nombre3[position]);
        _descripcion3.setText(descripcion3[position]);
        _imagen.setImageResource(id_images3[position]);
        return itemView;
    }
}



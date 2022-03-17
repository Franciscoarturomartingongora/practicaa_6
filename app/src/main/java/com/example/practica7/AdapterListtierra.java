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

public class AdapterListtierra extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombre4;
    private final String[] descripcion4;
    private final Integer[] id_images4;


    public AdapterListtierra(Activity context, String[] nombres4, String[] descripcion4, Integer[] id_images) {
        super(context,R.layout.item,nombres4);
        this.context = context;
        this.nombre4 = nombres4;
        this.descripcion4 = descripcion4;
        this.id_images4 = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre4 = (TextView) itemView.findViewById(R.id.nombre);
        TextView _descripcion4 = (TextView) itemView.findViewById(R.id.descripcion);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logolista);
        _nombre4.setText(nombre4[position]);
        _descripcion4.setText(descripcion4[position]);
        _imagen.setImageResource(id_images4[position]);
        return itemView;
    }

}

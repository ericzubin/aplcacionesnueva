package com.parse.starter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


/**
 * Created by ERIC on 06/10/2015.
 */
public class PersonasAdapter extends ArrayAdapter<Personas> {
    private Context context;
    private ArrayList<Personas> datos;
/*
    public PersonasAdapter(Runnable context, ArrayList<Personas> datos) {
        super((Context) context, R.layout.list_item, datos);
        // Guardamos los parámetros en variables de clase.
        this.context = (Context) context;
        this.datos = datos;
    }
    */
    public PersonasAdapter(Context context, ArrayList<Personas> datos) {
        super(context, R.layout.list_item, datos);
        // Guardamos los parámetros en variables de clase.
        this.context = context;
        this.datos = datos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        PersonasHolder holder;

        if (item == null) {
            item = LayoutInflater.from(context).inflate(R.layout.list_item,
                    null);
            // Inicializamos el holder y guardamos las referencias a los
            // controles.

            holder = new PersonasHolder();
            holder.imgPersona = (ImageView) item.findViewById(R.id.imageView);

            holder.imgPersona=new ImageView(context);
            holder.imgPersona.setLayoutParams(new GridView.LayoutParams(85, 85));
            holder.imgPersona.setScaleType(ImageView.ScaleType.CENTER_CROP);
            holder.imgPersona.setPadding(8,8,8,8);
           holder.txtPersona = (TextView) item.findViewById(R.id.textView4);
           // holder.tvField = (TextView) item.findViewById(R.id.textView4);

            // Almacenamos el holder en el Tag de la vista.
            item.setTag(holder);
        }
        // Recuperamos el holder del Tag de la vista.
        holder = (PersonasHolder) item.getTag();

        // A partir del holder, asignamos los valores que queramos a los
        // controles.
        // Le asignamos una foto al ImegeView.
       holder.imgPersona.setImageResource(datos.get(position)
        .getDrawableImageID(R.mipmap.ic_launcher));


//http://www.hermosaprogramacion.com/2015/07/tutorial-para-crear-un-gridview-en-android/
        // Asignamos los textos a los TextView.
        holder.txtPersona.setText(datos.get(position).getNombre());
        //holder.tvField.setText(String.valueOf(position));

        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }
}

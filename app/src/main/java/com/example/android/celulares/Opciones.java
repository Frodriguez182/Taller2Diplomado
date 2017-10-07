package com.example.android.celulares;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Opciones extends AppCompatActivity {

    private ListView ls;
    private Resources res;
    //private String[] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        ls=(ListView)findViewById(R.id.lstOptions);
        res=this.getResources();
        int layout = android.R.layout.simple_list_item_1;
        String [] Opciones = res.getStringArray(R.array.lstOpciones);

        //opc=res.getStringArray(R.array.lstOpciones);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,layout , Opciones);
        ls.setAdapter(adapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Opciones.this);
                switch (position) {
                    case 0:
                        i = new Intent(Opciones.this, Registrar.class);
                        startActivity(i);
                        break;
                    case 1:
                        builder.setTitle(res.getString(R.string.accion1))
                                .setMessage(Metodos.cantidadAppleNegros(Datos.obtenerCelulares()) + "")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                })
                                .show();
                        break;
                    case 2:
                        builder.setTitle(rsrcs.getString(R.string.accion2))
                                .setMessage(Metodos.precioPromedioNokia(Datos.obtenerCelulares()) + "")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                })
                                .show();
                        break;
                    case 3:
                        i = new Intent(Opciones.this, Reporte.class);
                        startActivity(i);
                        break;
                }
            }
});
    }


}
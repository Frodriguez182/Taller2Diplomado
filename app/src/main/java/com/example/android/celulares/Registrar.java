package com.example.android.celulares;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class Registrar extends AppCompatActivity {

    private Spinner marca, os, color;
    private EditText imei, precio, ram;
    private Context context;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Spinner spinnerMarca = (Spinner) findViewById(R.id.Marca_spinner);
        ArrayAdapter<CharSequence> adapterMarca = ArrayAdapter.createFromResource(this,
                R.array.Marca_array, android.R.layout.simple_spinner_item);
        adapterMarca.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMarca.setAdapter(adapterMarca);

        Spinner spinnerOs = (Spinner) findViewById(R.id.Os_spinner);
        ArrayAdapter<CharSequence> adapterOs = ArrayAdapter.createFromResource(this,
                R.array.os_array, android.R.layout.simple_spinner_item);
        adapterOs.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOs.setAdapter(adapterOs);

        Spinner spinnerColor = (Spinner) findViewById(R.id.Color_spinner);
        ArrayAdapter<CharSequence> adapterColor = ArrayAdapter.createFromResource(this,
                R.array.Color_array, android.R.layout.simple_spinner_item);
        adapterColor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerColor.setAdapter(adapterColor);

        marca=(Spinner)findViewById(R.id.Marca_spinner);
        os=(Spinner)findViewById(R.id.Os_spinner);
        color=(Spinner)findViewById(R.id.Color_spinner);

        imei=(EditText)findViewById(R.id.txtImei);
        precio=(EditText)findViewById(R.id.txtPrecio);
        ram=(EditText)findViewById(R.id.txtRam);
        context=this;
        res=this.getResources();
    }

    public void registrarEquipo(View v){
        String osFinal, colorFinal,imeiFinal, marcaFinal, precioFinal, ramFinal;

        marcaFinal=marca.getSelectedItem().toString().trim();
        osFinal=os.getSelectedItem().toString().trim();
        colorFinal=color.getSelectedItem().toString().trim();

        imeiFinal=imei.getText().toString().trim();
        precioFinal=precio.getText().toString().trim();
        ramFinal=ram.getText().toString().trim();

        Celular c = new Celular(osFinal,colorFinal,imeiFinal,marcaFinal,precioFinal,ramFinal);
        c.guardar();

        new AlertDialog.Builder(context).setTitle(res.getString(R.string.msjTitulo))
                .setMessage(R.string.msjCuerpo).show();

        imei.setText("");
        precio.setText("");
        ram.setText("");
        imei.requestFocus();
    }

    public void borrar (){
        imei.setText("");
        precio.setText("");
        ram.setText("");
        imei.requestFocus();
    }



}

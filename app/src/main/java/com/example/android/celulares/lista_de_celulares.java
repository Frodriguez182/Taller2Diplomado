package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class lista_de_celulares extends AppCompatActivity {

        private ListView lv;
        private EditText precio,capacidad;
       private String [] marca,sistema,color;
        private Resources resources;
        private Spinner marca_spiner;
        private Spinner sistema_spiner;
        private Spinner color_spiner;

        private Intent in;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_agregar_celulares);
            marca_spiner=(Spinner) findViewById(R.id.cbxmarca);
            sistema_spiner=(Spinner) findViewById(R.id.cbxsistema);
            color_spiner=(Spinner) findViewById(R.id.cbxcolor);
            resources=this.getResources();
            marca=resources.getStringArray(R.array.marca);
            sistema=resources.getStringArray(R.array.sistema);
            color=resources.getStringArray(R.array.color);
            ArrayAdapter<String> adapter_color = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,color);
            color_spiner.setAdapter(adapter_color);
            ArrayAdapter<String> adapter_sistema = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sistema);
            sistema_spiner.setAdapter(adapter_sistema);
            ArrayAdapter<String> adapter_marca= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,marca);
            marca_spiner.setAdapter(adapter_marca);
            precio=(EditText)findViewById(R.id.txtprecio);
            capacidad=(EditText)findViewById(R.id.txtcapacidad);
        }

        public void Guardar(View v){

            if (precio.getText().toString().length()==0 || capacidad.getText().toString().length()==0){
                Toast.makeText(this,resources.getString(R.string.error),Toast.LENGTH_SHORT).show();
            }else {


                int sel_marca = marca_spiner.getSelectedItemPosition();
                int sel_sistema = sistema_spiner.getSelectedItemPosition();
                int sel_color = color_spiner.getSelectedItemPosition();

                double precio_sele = Double.parseDouble(precio.getText().toString());
                double capacidad_Sele = Double.parseDouble(capacidad.getText().toString());
                if (datos.ValidarEnteros(capacidad_Sele,precio_sele) == false){
                    Toast.makeText(this,resources.getString(R.string.error2),Toast.LENGTH_SHORT).show();
                }else {
                    celulares c = new celulares(precio_sele, capacidad_Sele, sel_marca, sel_color, sel_sistema);
                    c.Guardar();
                    Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

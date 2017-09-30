package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class reportes extends AppCompatActivity {
    private String reporte[];
    private EditText res;
    private Resources resources;
    private ArrayList<celulares> celulares;
    private Spinner reporte_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        resources=this.getResources();
        celulares = metodos.Obtener();
        reporte_spinner=(Spinner) findViewById(R.id.cbxreporte);
        reporte=resources.getStringArray(R.array.reporte);
        ArrayAdapter<String> adapter_reporte = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,reporte);
        reporte_spinner.setAdapter(adapter_reporte);
        res=(EditText)findViewById(R.id.txtresultado);
    }
    public void Generar_Reporte(View v){
        int sel_reporte = reporte_spinner.getSelectedItemPosition();
        if (sel_reporte==0){
            ArrayList<celulares> cel = metodos.Obtener_precio_capacidad(celulares);
            String resultado = "";
            for (int i = 0; i < cel.size() ; i++) {
                resultado = resultado +  "celular No." + (i+1) + ": \nPrecio = " + cel.get(i).getPrecio() + ", \nMemoria = " + cel.get(i).getCapacidad() + "\n\n";

            }
            res.setText(resultado);
        }else if(sel_reporte==1){
            res.setText(""+metodos.Obtener_marca_apple(celulares));
        }else{
            res.setText(""+metodos.celulares_precio_nokia(celulares));
        }
    }



}
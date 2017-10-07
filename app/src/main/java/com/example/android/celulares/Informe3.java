package com.example.android.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class Informe3 extends AppCompatActivity {

    private ArrayList<Celular> celularArrayList;
    private int cantidad;
    private EditText ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe3);

        celularArrayList=Datos.getCelulares();

        for (int i = 0; i < celularArrayList.size(); i++) {
            if (celularArrayList.get(i).getMarca().equals("Apple") && celularArrayList.get(i).getColor()
                    .equals("Negro")){
                cantidad=cantidad+1;
            }
        }

        ans=(EditText)findViewById(R.id.txtInforme4Resultado);

        if (cantidad==0){
            ans.setText(R.string.txtInforme4NoHay);
        }else {
            String cantidadStr = String.valueOf(cantidad);
            ans.setText("" + cantidadStr);
        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informe_4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}


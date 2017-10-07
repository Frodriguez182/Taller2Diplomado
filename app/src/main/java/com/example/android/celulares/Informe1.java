package com.example.android.celulares;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Informe1 extends AppCompatActivity {

    private TableLayout table;
    private ArrayList<Celular> celularArrayList;
    private Context context;
    private Resources res;
    private int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe1);

        table=(TableLayout)findViewById(R.id.tblDates);
        celularArrayList=Datos.getCelulares();

        for (int i = 0; i < celularArrayList.size() ; i++) {
            if (celularArrayList.get(i).getMarca().equals("Samsung") &&
                    celularArrayList.get(i).getColor().equals("Negro")){
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);

                cont = cont+1;

                c1.setText(""+(cont));
                c2.setText(celularArrayList.get(i).getImei());
                c3.setText(celularArrayList.get(i).getPrecio());
                c4.setText(celularArrayList.get(i).getRam());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);

                fila.setGravity(Gravity.CENTER_HORIZONTAL);
                c2.setPadding(0,20,0,0);
                c3.setPadding(0,20,0,0);
                c4.setPadding(0,20,0,0);

                table.addView(fila);
            }
        }

        if (cont==0){
            new AlertDialog.Builder(context).setTitle(res.getString(R.string.msjTitulo))
                    .setMessage(R.string.msjInforme1Cuerpo).show();
        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informe_1, menu);
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

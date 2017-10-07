package com.example.android.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Informe2 extends AppCompatActivity {

    private TableLayout table;
    private ArrayList<Celular> celularArrayList;
    private int cont=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe2);

        table=(TableLayout)findViewById(R.id.tblDates);
        celularArrayList=Datos.getCelulares();

        for (int i = 0; i < celularArrayList.size() ; i++) {
            double ram = Double.parseDouble(celularArrayList.get(i).getRam().toString());
            if (celularArrayList.get(i).getMarca().equals("Samsung") && 2 <= ram && 4 >= ram){
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);
                TextView c6 = new TextView(this);

                c1.setText(""+(cont));
                c2.setText(celularArrayList.get(i).getMarca());
                c3.setText(celularArrayList.get(i).getPrecio());
                c4.setText(celularArrayList.get(i).getRam());
                c5.setText(celularArrayList.get(i).getOs());
                c6.setText(celularArrayList.get(i).getColor());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);

                fila.setGravity(Gravity.CENTER_HORIZONTAL);
                c2.setPadding(0,20,0,0);
                c3.setPadding(0,20,0,0);
                c4.setPadding(0,20,0,0);

                table.addView(fila);

                cont = cont +1;
            }
        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informe_2, menu);
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

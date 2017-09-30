package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class principal extends AppCompatActivity {
    private ListView lv;
    private Resources recursos;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = (ListView)findViewById(R.id.opciones);
        recursos = this.getResources();
        opc = recursos.getStringArray(R.array.opciones);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(Adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(principal.this,nuevo_celular.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(principal.this,lista_de_celulares.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(principal.this,reportes.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}

package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by android on 30/09/2017.
 */

public class metodos {

    private static ArrayList<celulares> cel = new ArrayList<>();

    public static void Guardarcelulares(celulares p){
        cel.add(p);
    }

    public static ArrayList<celulares> Obtener(){
        return  cel;
    }

    public static ArrayList<celulares> Obtener_precio_capacidad(ArrayList<celulares> cel)
    {

        ArrayList<celulares> resultado = new ArrayList<>();
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==1 && cel.get(i).getColor()==0 && cel.get(i).getSistema()==0){
                resultado.add(cel.get(i));

            }
        }

        return  resultado;
    }

    public static int Obtener_marca_apple(ArrayList<celulares> cel)
    {
        int sw =0 ;

        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==3 && cel.get(i).getColor()==0){
                sw = sw+1;
            }
        }

        return   sw;
    }

    public static double celulares_precio_nokia(ArrayList<celulares> cel)
    {
        double suma = 0;
        int sw =0 ;
        if (cel.size()==0){
            return 0;
        }
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==0){
                suma = suma + cel.get(i).getPrecio();
                sw = sw+1;
            }
        }

        return  (suma/sw);
    }

    public static boolean ValidarEnteros(double cap, double pre){
        if (cap ==0 || pre ==0)return false;
        return true;
    }
}


package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by android on 07/10/2017.
 */

public class Datos {

    private static ArrayList<Celular> celulares = new ArrayList();

    public static void guardar(Celular c){
        celulares.add(c);
    }

    public static ArrayList<Celular> getCelulares() {
        return celulares;
    }
}



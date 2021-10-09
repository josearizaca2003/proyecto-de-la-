package crudvector;

import java.util.*;

public class metodosSistema {
    
    public Vector lista = new Vector();
    public ArrayList<datosPersona> listaPersonas= new ArrayList<>();
    
    /*
    public void registrarPersona(Object x){
        lista.add(x);
    }
    */
    public void registrarPersona(datosPersona dp){
        listaPersonas.add(dp);
    }
    
    public void EliminarPersona(String Nombre, String codigo){
        for(int i=0; i<listaPersonas.size(); i++ ) {
        datosPersona dp= listaPersonas.get(i);
           if(Nombre.equals(dp.nombres) && codigo.equals(dp.codigo)){
               System.out.print("Eliminando"+dp.nombres);
               listaPersonas.remove(i);
           }
       }
    }
}
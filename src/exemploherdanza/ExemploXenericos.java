
package exemploherdanza;

import java.util.ArrayList;

public class ExemploXenericos {
    
    public static void main(String[] args) {
    Xenerica<String> obxString = new Xenerica<String>(); 
    // obxecto tipo String  
     obxString.setVariable("lalala");
     obxString.amosar();
     
     Publicacion obxP= new Publicacion(12,12f);
     Xenerica<Publicacion> publi = new Xenerica<Publicacion>(); 
     publi.setVariable(obxP);
     publi.amosar();
     
     Xenerica<Periodico> per = new Xenerica<Periodico>();
     Periodico obxPer = new Periodico("1/1/1/","Faro de Vigo");
         
     per.setVariable(obxPer);
     per.amosar();
     
    }      
}
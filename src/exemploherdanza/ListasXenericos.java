

package exemploherdanza;

import java.util.ArrayList;
import java.util.List;

public class ListasXenericos<T>  {
    ArrayList <T>lista = new ArrayList<T>();

    public ListasXenericos() {
       
    }
  public void amosar(ArrayList<T> lista){
      for(int i =0;i< lista.size();i++){
          System.out.println(lista.get(i));
      }
  }
      public void engadir(T ele){
          lista.add(ele);
      }
      public ArrayList<T>getArray(){
          return lista;
      }
      
     
      
  }
    


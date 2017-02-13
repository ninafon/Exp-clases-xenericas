

package exemploherdanza;

import java.util.ArrayList;
import java.util.List;

public class ListasXenericos<T>  {
    
  public void amosar(ArrayList<T> lista){
      for(int i =0;i< lista.size();i++){
          System.out.println(lista.get(i));
      }
      
  }
    
}

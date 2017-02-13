

package exemploherdanza;

public class Periodico extends Publicacion {
    private String data;
    private String nome;

    public Periodico() {
    }

    public Periodico(String data, String nome) {
        this.data = data;
        this.nome = nome;
    } 

    public Periodico(String data, String nome, int numPaxinas, float Precio) {
        super(numPaxinas, Precio);
        this.data = data;
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
    
        return "Periodico{" + "data=" + data + ", nome=" + nome + super.toString()+ '}';
    }
public void comprobarAcceso(){
    Publicacion publi = new Publicacion();
    
    System.out.println("num paxinas : "+ numPaxinas);
    System.out.println("precio : "+ publi.getPrecio() );
    
    
}
   
    
    

}

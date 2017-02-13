
package exemploherdanza;

public class Publicacion {
    int numPaxinas;
    private float Precio;

    public Publicacion() {
    }

    public Publicacion(int numPaxinas, float Precio) {
        this.numPaxinas = numPaxinas;
        this.Precio = Precio;
    }

    public int getNumPaxinas() {
        return numPaxinas;
    }

    public void setNumPaxinas(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "numPaxinas=" + numPaxinas + ", Precio=" + Precio + '}';
    }
    public void mensaxe(){
        System.out.println(" dende a superclase ****");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Float.floatToIntBits(this.Precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacion other = (Publicacion) obj;
        if (Float.floatToIntBits(this.Precio) != Float.floatToIntBits(other.Precio)) {
            return false;
        }
        return true;
    }
    
    

}

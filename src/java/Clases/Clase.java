package Clases;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class Clase {
    private int id;
    private String nombre; 

    public Clase(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Clase() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

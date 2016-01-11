package Gestiones;

import java.util.List;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 * @param <generico>
 */

public interface iGestiones <generico> {
    
    public abstract String crear(generico x);
    public abstract String generar();
    public abstract List<generico> buscarListar ();
    public abstract generico buscarIndividual(String nombre);    
    public abstract String modificar(generico y);
    public abstract String eliminar(String nombre);    
}
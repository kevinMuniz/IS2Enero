package Gestiones;

import Clases.Clase;
import java.util.List;
import Servicios.Conexion;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionClase implements iGestiones<Clase>{

    private Conexion conx = new Conexion(); 
    
    @Override
    public String crear(Clase x) {
        return (conx.IngresarClase(x.getNombre()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clase buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clase> buscarListar() {
        return (conx.ListaClases());
    }

    @Override
    public String modificar(Clase y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

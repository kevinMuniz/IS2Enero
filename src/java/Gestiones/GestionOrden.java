package Gestiones;

import Clases.Orden;
import java.util.List;
import Servicios.Conexion;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionOrden implements iGestiones<Orden>{

     private Conexion conx = new Conexion();   
     
    @Override
    public String crear(Orden x) {
        return (conx.IngresoOrden(x.getNombre()));
    }

     @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Orden buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orden> buscarListar() {
        return (conx.ListaOrden());
    }

    @Override
    public String modificar(Orden y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
}

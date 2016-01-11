package Gestiones;

import Clases.Empaque;
import Servicios.Conexion;
import java.util.List;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionEmpaque implements iGestiones<Empaque>{

    private Conexion conx = new Conexion(); 
    
    @Override
    public String crear(Empaque x) {
        return (conx.IngresarEmpaque(x.getNombre(),x.getDescripcion()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empaque buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empaque> buscarListar() {
        return (conx.ListaEmpaques());
    }

    @Override
    public String modificar(Empaque y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

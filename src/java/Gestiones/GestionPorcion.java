package Gestiones;

import Servicios.Conexion;
import Clases.Porcion;
import java.util.List;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionPorcion implements iGestiones<Porcion>{

    private Conexion conx = new Conexion(); 

    @Override
    public String crear(Porcion x) {
        return (conx.IngresarPorcion(x.getNombre(), x.getDescripcion()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Porcion> buscarListar() {
        return (conx.ListaPorcions());
    }

    @Override
    public Porcion buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Porcion y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

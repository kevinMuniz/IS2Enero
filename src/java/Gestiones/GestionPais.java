package Gestiones;

import Clases.Pais;
import Servicios.Conexion;
import java.util.List;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionPais implements iGestiones<Pais>{

    private Conexion conx = new Conexion(); 
    
    @Override
    public String crear(Pais x) {
        return (conx.IngresarPais(x.getNombre(), x.getCodigo()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pais> buscarListar() {
        return (conx.ListaPaises());
    }

    @Override
    public Pais buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Pais y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

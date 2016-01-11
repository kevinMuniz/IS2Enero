package Gestiones;

import Clases.Familia;
import java.util.List;
import Servicios.Conexion;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionFamilia implements iGestiones<Familia>{

    private Conexion conx = new Conexion();    
    
    @Override
    public String crear(Familia x) {                
        return (conx.IngresoFamila(x.getNombre()));
    }

     @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Familia buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Familia> buscarListar() {
        return (conx.ListaFamilia());
    }

    @Override
    public String modificar(Familia y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
        
}

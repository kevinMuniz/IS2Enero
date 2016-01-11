package Gestiones;

import Servicios.Conexion;
import Clases.Preparacion;
import java.util.List;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionPreparacion implements iGestiones<Preparacion>{
    
    private Conexion conx = new Conexion(); 

    @Override
    public String crear(Preparacion x) {
        return (conx.IngresarPreparacion(x.getNombre(), x.getDescripcion()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Preparacion> buscarListar() {
        return (conx.ListapPreparacions());
    }

    @Override
    public Preparacion buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Preparacion y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

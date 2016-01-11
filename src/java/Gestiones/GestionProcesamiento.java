package Gestiones;

import Servicios.Conexion;
import Clases.Procesamiento;
import java.util.List;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionProcesamiento implements iGestiones<Procesamiento>{
    
    private Conexion conx = new Conexion(); 

    @Override
    public String crear(Procesamiento x) {
        return (conx.IngresarProcesamiento(x.getNombre(), x.getDescripcion()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Procesamiento> buscarListar() {
        return (conx.ListapProcesamientos());
    }

    @Override
    public Procesamiento buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Procesamiento y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

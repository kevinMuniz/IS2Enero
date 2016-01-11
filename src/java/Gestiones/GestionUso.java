package Gestiones;

import Servicios.Conexion;
import Clases.Uso;
import java.util.List;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionUso implements iGestiones<Uso>{
    
    private Conexion conx = new Conexion(); 

    @Override
    public String crear(Uso x) {
        return(conx.IngresarUso(x.getNombre()));
    }

    @Override
    public String generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Uso> buscarListar() {
        return (conx.ListaUsos());
    }

    @Override
    public Uso buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Uso y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

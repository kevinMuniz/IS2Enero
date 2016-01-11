package Gestiones;

import Clases.Especie;
import java.util.List;
import Servicios.Conexion;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class GestionEspecie implements iGestiones<Especie>{
    
      private Conexion conx = new Conexion(); 

    @Override
    public String crear(Especie x) {
        return (conx.IngresarEspecie(x.getNombre(), x.getFamilia(), x.getOrden(), x.getClase(), x.getPaises(), x.getNombreComercial(), x.getProcesamientos(),x.getEmpaques(), x.getPorcion(), x.getDistribucion(), x.getHabitad(), x.getTalla(), x.getUsos(), x.getPreparaciones()));
    }

    @Override
    public String generar() {
        return (conx.generarEspcies());
    }

    @Override
    public List<Especie> buscarListar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Especie buscarIndividual(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Especie y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}

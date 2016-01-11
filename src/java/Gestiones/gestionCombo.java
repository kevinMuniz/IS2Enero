package Gestiones;

import Servicios.Conexion;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class gestionCombo implements iCombo<String>{

    private Conexion conx = new Conexion(); 
    
    @Override
    public String comboFamilia() {
         return (conx.comboFamilia());
    }

    @Override
    public String comboPais() {
        return (conx.comboPais());
    }

    @Override
    public String comboProcesamiento() {
        return (conx.comboProcesamiento());
    }

    @Override
    public String comboEmpaque() {
        return(conx.comboEmpaque());
    }

    @Override
    public String comboUso() {
        return (conx.comboUso());
    }

    @Override
    public String comboPreparacion() {
        return(conx.comboPreparacion());
    }

    @Override
    public String comboOrden() {
        return(conx.comboOrden());
    }

    @Override
    public String comboClase() {
        return (conx.comboClase());
    }

    @Override
    public String comboPorcion() {
        return (conx.comboPorcion());
    }
    
}

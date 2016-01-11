package Servicios;

import Clases.Especie;
import Gestiones.GestionEspecie;
import Gestiones.gestionCombo;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */

@Path ("especie")
public class especieServicio {
    
    public GestionEspecie obj = new GestionEspecie();
    public gestionCombo obj2 = new gestionCombo();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Especie x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Especie> consultar()
    {           
        return obj.buscarListar();
    }
    
    @GET
    @Path("generar")    
    @Produces(MediaType.TEXT_PLAIN)
    public String generarFamilia(){
        return (obj.generar());
    }
    
    @GET
    @Path("combo_f")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboFamilia(){
        return (obj2.comboFamilia());
    }
    
    @GET
    @Path("combo_o")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboOrden(){
        return (obj2.comboOrden());
    }
    
    @GET
    @Path("combo_c")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboC(){
        return (obj2.comboClase());
    }
    
    @GET
    @Path("combo_p")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboP(){
        return (obj2.comboPais());
    }
    
    @GET
    @Path("combo_pro")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboPro(){
        return (obj2.comboProcesamiento());
    }
    
    @GET
    @Path("combo_e")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboE(){
        return (obj2.comboEmpaque());
    }
    
    @GET
    @Path("combo_por")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboPor(){
        return (obj2.comboPorcion());
    }
    
    @GET
    @Path("combo_u")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboU(){
        return (obj2.comboUso());
    }
    
    @GET
    @Path("combo_pre")    
    @Produces(MediaType.TEXT_PLAIN)
    public String comboPre(){
        return (obj2.comboPreparacion());
    }
}

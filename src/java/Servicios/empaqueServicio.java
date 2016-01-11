package Servicios;

import Clases.Empaque;
import Gestiones.GestionEmpaque;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.GET;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
@Path("empaque")
public class empaqueServicio {
    
    public GestionEmpaque obj = new GestionEmpaque();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Empaque x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Empaque> consultar()
    {           
        return obj.buscarListar();
    }
}

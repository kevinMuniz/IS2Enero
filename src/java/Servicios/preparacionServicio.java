package Servicios;

import Clases.Preparacion;
import Gestiones.GestionPreparacion;
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

@Path("preparacion")
public class preparacionServicio {
 
    public GestionPreparacion obj = new GestionPreparacion();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Preparacion x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Preparacion> consultar()
    {           
        return obj.buscarListar();
    }
}

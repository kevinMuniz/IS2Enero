package Servicios;

import Clases.Orden;
import Gestiones.GestionOrden;
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

@Path ("orden")
public class ordenServicio {
    
    public GestionOrden obj = new GestionOrden();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Orden x)
    {              
        return obj.crear(x);
    }
      
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Orden> consultar()
    {           
        return obj.buscarListar();
    }
}

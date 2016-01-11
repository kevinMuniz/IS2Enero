package Servicios;

import Clases.Uso;
import Gestiones.GestionUso;
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

@Path("uso")
public class uosServicio {
    
    public GestionUso obj = new GestionUso();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Uso x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Uso> consultar()
    {           
        return obj.buscarListar();
    }
}

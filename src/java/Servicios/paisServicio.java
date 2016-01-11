package Servicios;

import Clases.Pais;
import Gestiones.GestionPais;
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

@Path("pais")
public class paisServicio {
 
    public GestionPais obj = new GestionPais();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Pais x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Pais> consultar()
    {           
        return obj.buscarListar();
    }
}

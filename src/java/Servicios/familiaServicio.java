package Servicios;

import Clases.Familia;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Gestiones.GestionFamilia;
import java.util.List;
import javax.ws.rs.GET;
/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */

@Path("familia")
public class familiaServicio {
    
    public GestionFamilia obj = new GestionFamilia();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Familia x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Familia> consultar()
    {           
        return obj.buscarListar();
    }

}

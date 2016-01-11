package Servicios;

import Clases.Porcion;
import Gestiones.GestionPorcion;
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

@Path("porcion")
public class porcionServicio {
 
    public GestionPorcion obj = new GestionPorcion();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Porcion x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Porcion> consultar()
    {           
        return obj.buscarListar();
    }
}

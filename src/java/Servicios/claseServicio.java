package Servicios;

import Clases.Clase;
import Gestiones.GestionClase;
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

@Path("clase")
public class claseServicio {
    
    public GestionClase obj = new GestionClase();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Clase x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Clase> consultar()
    {           
        return obj.buscarListar();
    }
}
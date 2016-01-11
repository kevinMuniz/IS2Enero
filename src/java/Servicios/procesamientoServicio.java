package Servicios;

import Clases.Procesamiento;
import Gestiones.GestionProcesamiento;
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

@Path("procesamiento")
public class procesamientoServicio {
    
    public GestionProcesamiento obj = new GestionProcesamiento();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String insertar( Procesamiento x)
    {              
        return obj.crear(x);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Procesamiento> consultar()
    {           
        return obj.buscarListar();
    }
}

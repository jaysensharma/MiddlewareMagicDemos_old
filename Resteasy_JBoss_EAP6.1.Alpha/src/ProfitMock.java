package ws.test;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("profitmock")
@Path("api")
@Produces(MediaType.APPLICATION_JSON)
public class ProfitMock  extends Application  
{
    
          @GET
          @Path("list")
          @Produces(MediaType.APPLICATION_JSON)
    public String list() {
        return "Hello World, I still need some work to be useful!";
    }
  }
 

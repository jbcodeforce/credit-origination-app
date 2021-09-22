package ibm.gtm.dba.app;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import ibm.gtm.dba.domain.LoanApplication;

@Path("/api/v1/loans")
public class LoanApplicationResource {

    @ConfigProperty(name="app.version")
    public String version;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/version")
    @Produces(MediaType.APPLICATION_JSON)
    public String getVersion(){
        return "{ \"version\": \"" + version + "\"}";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String createLoanApplication(LoanApplication loanApplication){
        System.out.println(loanApplication.toString());
        return "{ \"loanApplicationId\" : 123 \"}";
    }
}
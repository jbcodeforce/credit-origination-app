package ibm.gtm.dba.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;;

@QuarkusTest
public class LoanApplicationResoureTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/v1/loans/version")
          .then()
             .statusCode(200)
             .body(containsString("version"));
    }

}
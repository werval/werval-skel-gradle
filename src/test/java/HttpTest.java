
import org.junit.ClassRule;
import org.junit.Test;
import io.werval.test.WervalHttpRule;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

public class HttpTest
{
    @ClassRule
    public static final WervalHttpRule WERVAL = new WervalHttpRule();

    @Test
    public void assertJsonMessageItWorks()
    {
        expect()
            .statusCode( 200 )
            .body( "message", equalTo( "It works!" ) )
            .when()
            .get( "/" );
    }
}

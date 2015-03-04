
import org.junit.ClassRule;
import org.junit.Test;
import io.werval.test.WervalHttpRule;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class HttpTest
{
    @ClassRule
    public static final WervalHttpRule WERVAL = new WervalHttpRule();

    @Test
    public void assertJsonMessageItWorks()
    {
        when().get( "/" )
            .then().statusCode( 200 )
            .and().body( "message", equalTo( "It works!" ) );
    }
}

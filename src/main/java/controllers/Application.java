package controllers;

import io.werval.api.outcomes.Outcome;
import static io.werval.api.context.CurrentContext.*;
import static io.werval.modules.json.JSON.*;

public class Application
{
    public Outcome index()
    {
        // Welcome Page
        return new io.werval.controllers.Welcome().welcome();

        // It works!
        // return outcomes().ok( "It works!" ).build();
        
        // JSON Object
        // return outcomes().ok( json().toJSON( json().newObject().put( "message", "It works!" ) ) ).asJson().build();
    }
}

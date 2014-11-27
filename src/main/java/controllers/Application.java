package controllers;

import org.qiweb.api.outcomes.Outcome;
import static org.qiweb.api.context.CurrentContext.*;
import static org.qiweb.modules.json.JSON.*;

public class Application
{
    public Outcome index()
    {
        // Welcome Page
        return new org.qiweb.controllers.Welcome().welcome();

        // It works!
        // return outcomes().ok( "It works!" ).build();
        
        // JSON Object
        // return outcomes().ok( json().toJSON( json().newObject().put( "message", "It works!" ) ) ).asJson().build();
    }
}

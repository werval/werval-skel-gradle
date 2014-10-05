package controllers;

import org.qiweb.api.outcomes.Outcome;
import static org.qiweb.api.context.CurrentContext.outcomes;

public class Application {

    public Outcome index() {
        return new org.qiweb.controllers.Welcome().welcome();
        // return outcomes().ok( "It works!" ).build();
    }

}

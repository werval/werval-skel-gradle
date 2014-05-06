package controllers;

import org.qiweb.api.outcomes.Outcome;

public class Application {

    public Outcome index() {
        return new org.qiweb.api.controllers.Welcome().welcome();
    }

}

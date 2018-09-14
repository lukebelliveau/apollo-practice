package com.bell.app;

import com.spotify.apollo.AppInit;
import com.spotify.apollo.Environment;
import com.spotify.apollo.route.Route;
import com.spotify.apollo.httpservice.LoadingException;
import com.spotify.apollo.httpservice.HttpService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws LoadingException {
        HttpService.boot(App::init, "app", args);
    }

    static void init(Environment environment) {
        environment.routingEngine()
            .registerAutoRoute(Route.sync("GET", "/", requestContext -> "hello world"));
    }
}

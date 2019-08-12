package com.qvision.screenplay.abilities;

import com.qvision.screenplay.exceptions.ActorCannotQueryDatabaseException;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.RefersToActor;

public class QueryDatabase implements Ability, RefersToActor {
    private final String urlDatabase;
    private final String username;
    private final String password;
    private Actor actor;

    private QueryDatabase(String urlDatabase, String username, String password) {
        this.urlDatabase = urlDatabase;
        this.username = username;
        this.password = password;
    }

    public static QueryDatabase configDatabase(String urlDatabase, String username, String password) {
        return new QueryDatabase(urlDatabase, username, password);
    }

    public static QueryDatabase as(Actor actor) {
        if (actor.abilityTo(QueryDatabase.class) == null) {
            throw new ActorCannotQueryDatabaseException(actor.getName());
        }
        return actor.abilityTo(QueryDatabase.class).asActor(actor);
    }

    @Override
    public <T extends Ability> T asActor(Actor actor) {
        this.actor = actor;
        return (T) this;
    }

    public void createConnection() {
        /*
        Aca ira una magia que veremos en otro ejercicio para extraer información de la base de datos.
         */
    }

    @Override
    public String toString() {
        return "query the database";
    }
}

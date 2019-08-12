package com.qvision.screenplay.abilities;

import net.serenitybdd.screenplay.Ability;

public class QueryDatabase implements Ability {
    private final String urlDatabase;
    private final String username;
    private final String password;

    private QueryDatabase(String urlDatabase, String username, String password) {
        this.urlDatabase = urlDatabase;
        this.username = username;
        this.password = password;
    }

    public static QueryDatabase configDatabase(String urlDatabase, String username, String password) {
        return new QueryDatabase(urlDatabase, username, password);
    }

}

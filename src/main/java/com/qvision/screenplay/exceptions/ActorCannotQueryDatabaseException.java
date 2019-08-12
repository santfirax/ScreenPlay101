package com.qvision.screenplay.exceptions;

public class ActorCannotQueryDatabaseException extends RuntimeException {
    public ActorCannotQueryDatabaseException(String name) {
        super("The actor" + name + " does not have the ability to query the database");
    }
}

package com.qvision.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionSinAnotacionSubject implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        /* esto no queda en la evidencia*/
        return "Ejemplo de anotacion subject";
    }

    @Override
    public String getSubject() {
        return "Question implementando el metodo getSubject sin anotacion";
    }
}

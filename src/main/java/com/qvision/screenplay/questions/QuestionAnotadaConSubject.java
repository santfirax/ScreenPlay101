package com.qvision.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Mi titulo de Question para la descripcion de eviencia")
public class QuestionAnotadaConSubject implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        /* esto no queda en la evidencia*/
        return "Ejemplo de anotacion subject";
    }
}

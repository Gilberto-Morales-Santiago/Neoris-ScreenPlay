package com.neoris.screenplay.task;

import com.neoris.screenplay.model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static IniciarSesion conElUsuario(Usuario usuario) {
        return null;
    }
}
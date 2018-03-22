package pe.tuna.models;

import org.springframework.stereotype.Component;

@Component
public class Juventus implements IEquipo{
    public void mostrar() {
        System.out.println("Ahora eres del juventus");
    }
}

package pe.tuna.models;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
    @Value("Hola mundo usando anotaciones 2")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}

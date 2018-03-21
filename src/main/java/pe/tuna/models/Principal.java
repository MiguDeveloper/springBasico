package pe.tuna.models;

public class Principal {
    public static void main(String[] args) {
        Messi messi = new Messi(new Juventus());
        messi.mostrarEquipo();

        Messi messi1 = new Messi(new Manchester());
        messi1.mostrarEquipo();

    }
}

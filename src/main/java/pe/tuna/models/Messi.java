package pe.tuna.models;

public class Messi {
    private IEquipo equipo;

    public Messi(IEquipo equipo){
        this.equipo = equipo;
    }

    public IEquipo getEquipo() {
        return equipo;
    }

    public void setEquipo(IEquipo equipo) {
        this.equipo = equipo;
    }

    public void mostrarEquipo(){
        equipo.mostrar();
    }
}

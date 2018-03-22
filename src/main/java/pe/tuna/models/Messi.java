package pe.tuna.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Messi {

    //@Autowired
    //@Qualifier("")
    private IEquipo equipo;

    public Messi() {
    }

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

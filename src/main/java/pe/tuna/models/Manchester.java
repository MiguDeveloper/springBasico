package pe.tuna.models;

import org.springframework.stereotype.Component;
import pe.tuna.interfaces.IEquipo;

@Component
public class Manchester implements IEquipo{

    public String mostrarEquipo() {
        return ("Ahora estas en el Manchester");
    }
}

package pe.tuna.models;

import org.springframework.stereotype.Component;
import pe.tuna.interfaces.IEquipo;

@Component
public class Boca implements IEquipo{

    public String mostrarEquipo() {
        return ("Tu equipo actual es Boca Juniors");
    }
}

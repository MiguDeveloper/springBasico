package pe.tuna.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.tuna.config.AppConfig;

import java.util.Scanner;

public class CasoPractico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija un equipo: 1 Boca, 2 Manchester");
        int rpta = scanner.nextInt();

        // Ejemplo con XML configuracion
        // ApplicationContext appContext = new ClassPathXmlApplicationContext("beansCasoEjemplo.xml");
        // Jugador jugador = (Jugador) appContext.getBean("jugador1");

        // Ahora mapeamos desde un clase de configuracion usando anotaciones
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Jugador jugador = (Jugador) appContext.getBean("jugador1");

        switch (rpta){
            case 1:
                jugador.setEquipo(new Boca());
                break;
            case 2:
                jugador.setEquipo(new Manchester());
                break;
                default:
                    break;
        }

        System.out.println(
                jugador.getNombre() + "-"
                        + jugador.getEquipo().mostrarEquipo() + "- Nro. Camiseta: "
                        + jugador.getCamiseta().getNumero() + "- Camiseta Marca: "
                        + jugador.getCamiseta().getMarca().getNombre()
        );

        ((ConfigurableApplicationContext) appContext).close();
    }
}

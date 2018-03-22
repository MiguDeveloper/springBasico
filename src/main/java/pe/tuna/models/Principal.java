package pe.tuna.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args) {

        Messi messi = new Messi(new Juventus());
        messi.mostrarEquipo();

        /*
        Messi messi1 = new Messi(new Manchester());
        messi1.mostrarEquipo();*/

        // Hacemos referencia al archivo de configuracion Spring XML o spring container
        /*ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
         Mundo m = (Mundo) appContext.getBean("mundo");*/

        // Ahora accedemos por medio de la anotacion
        // podemos enviarlo por parametro usando comas
        /*ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
        Mundo m = (Mundo) appContext.getBean("marte");*/

        // haciendo uso sin parametros
        /*AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(AppConfig.class);
        appContext.register(AppConfig2.class);
        appContext.refresh(); // reconstruyes el archivo de configuracion con todas las configuraciones de los beans

        Mundo m = (Mundo) appContext.getBean("marte");
        System.out.println(m.getSaludo()); */

        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Persona per = (Persona) appContext.getBean("persona");

        String nombresCiudades = "";
        for (Ciudad ciudad: per.getPais().getCiudades()) {
            nombresCiudades += ciudad.getNombre() + "-";
        }
        System.out.println(per.getId() + ", " + per.getPais().getNombre() + " - "
                + nombresCiudades + ", " + per.getNombre() + " - " + per.getApodo());

        ((ConfigurableApplicationContext) appContext).close();

    }
}

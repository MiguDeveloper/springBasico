package pe.tuna.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.tuna.models.Boca;
import pe.tuna.models.Camiseta;
import pe.tuna.models.Jugador;
import pe.tuna.models.Marca;

@Configuration
public class AppConfig {

    @Bean
    public Jugador jugador1(){
        return new Jugador();
    }

    @Bean
    public Boca boca(){
        return new Boca();
    }

    @Bean
    public Camiseta camiseta(){
        return new Camiseta();
    }

    @Bean
    public Marca marca(){
        return new Marca();
    }

}

package pe.tuna.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {
    private int id;
    private String nombre;
    private String apodo;
    private Pais pais;

    /*
    public Persona(int id, String nombre, String apodo) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
    }*/


    @PostConstruct
    private void initBean(){
        System.out.println("Antes de inicializar el bean");
    }

    @PreDestroy
    private void detroyBean(){
        System.out.println("Bean a punto de ser destruido");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

package mascotaapp.entidades;

import mascotaapp.enumeraciones.Raza;
import mascotaapp.enumeraciones.SexoAnimal;

public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private Raza raza;
    private SexoAnimal sexo;
    
    private int energia;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, boolean cola, Raza raza, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", sexo=" + sexo + ", energia=" + energia + '}';
    }
    
    
    
    
    
    
    
}

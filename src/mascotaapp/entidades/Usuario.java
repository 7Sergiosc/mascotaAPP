package mascotaapp.entidades;

import java.util.Date;
import java.util.List;
import mascotaapp.enumeraciones.SexoHumano;

public class Usuario {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;

    private List<Mascota> mascotas;

    private Mascota mascotaFavorita;
    
    public Usuario() {
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ", mascotas=" + mascotas + ", mascotaFavorita=" + mascotaFavorita + '}';
    }
    
    
    
}

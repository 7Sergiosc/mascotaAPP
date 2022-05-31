package mascotaapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mascotaapp.entidades.Mascota;
import mascotaapp.entidades.Usuario;
import mascotaapp.enumeraciones.Raza;
import mascotaapp.enumeraciones.SexoHumano;

public class MascotaAPP {

    public static void main(String[] args) {
        Mascota m1 = new Mascota("Chimuelo", "Chimi", "Gato");
        
        Mascota m2 = new Mascota("Tobias", "Tobi", "Perro");
        
        List<Mascota> mascotas = new ArrayList();
        
        mascotas.add(m1);
        
        mascotas.add(m2);
        
        
        Usuario u = new Usuario();
        
        u.setApellido("Ciminari");
        u.setNacimiento(new Date());
        u.setSexo(SexoHumano.HOMBRE);
        
        u.setMascotaFavorita(m1);
        u.setMascotas(mascotas);
        
        System.out.println(u.toString());
    }    
}

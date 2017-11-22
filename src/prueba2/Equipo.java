package prueba2;

public class Equipo {

    String nombre;
    Jugador jugador1;
    Jugador jugador2;

    public Equipo() {
    }

    public Equipo(String nombre, Jugador jugador1, Jugador jugador2) {
        this.nombre = nombre;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador(Jugador jugador1) {
        this.jugador1 = jugador1;

    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
}

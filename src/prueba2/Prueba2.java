package prueba2;

public class Prueba2 {

    public static void main(String[] args) {

        ArbolBinario ab = new ArbolBinario();
//        Jugador jug = new Jugador();
//        Equipo equip = new Equipo();

        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(4);
        Nodo n5 = new Nodo(5);
        Nodo n6 = new Nodo(6);
        Nodo n7 = new Nodo(7);

        n3.setHijoIzq(n6);
        n3.setHijoDer(n7);
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);
        n1.setHijoIzq(n2);
        n1.setHijoDer(n3);
        ab.setRaiz(n1);

        System.out.println("\n PREORDEN");
        ab.preorden();
        System.out.println("\n POSTORDEN");
        ab.postOrden();
        System.out.println("\n INORDEN");
        ab.inOrden();
        System.out.println("\n " + ab.altura());
        System.out.println("\n " + ab.contar());

//         Equipo equipo1 = new Equipo("team1");
//         Equipo equipo2 = new Equipo("team2");
//         Equipo equipo3 = new Equipo("team3");
//         Equipo equipo4 = new Equipo("team4");
//         Equipo equipo5 = new Equipo("team5");
//         Equipo equipo6 = new Equipo("team6");
//         Equipo equipo7 = new Equipo("team7");
//         Equipo equipo8 = new Equipo("team8");
//         
//         Jugador jugador1 = new Jugador("Pedro");
//         Jugador jugador2 = new Jugador("Marcelo");
//         Jugador jugador3 = new Jugador("David");
//         Jugador jugador4 = new Jugador("Javier");
//         Jugador jugador5 = new Jugador("Victor");
//         Jugador jugador6 = new Jugador("Juan");
//         Jugador jugador7 = new Jugador("Jose");
//         Jugador jugador8 = new Jugador("Benjamin");
        //Nodo n1 = new Nodo(1,equipo1);
//        Nodo n1 = new Nodo(6);
//        Nodo n2 = new Nodo(7);
//        Nodo n3 = new Nodo(3);
//        Nodo n4 = new Nodo(9);
//        Nodo n5 = new Nodo(5);
//        Nodo n6 = new Nodo(34);
//        Nodo n7 = new Nodo(11);

        /* System.out.println("Partido 1");
        System.out.println("nombre equipo 1 : "+ equipo1.getNombre());
        System.out.println("Jugadores : "+ jugador1.getNombre()+" Y " + jugador2.getNombre());
        System.out.println("Nombre equipo 2 : "+ equipo2.getNombre());
        System.out.println("Jugadores : "+ jugador3.getNombre()+" Y " + jugador4.getNombre());
        System.out.println("-------------------------------------");
        System.out.println("Partido 2");
        System.out.println("nombre equipo 1 : "+ equipo3.getNombre());
        System.out.println("Jugadores : "+ jugador5.getNombre()+" Y " + jugador6.getNombre());
        System.out.println("Nombre equipo 2 : "+ equipo4.getNombre());
        System.out.println("Jugadores : "+ jugador7.getNombre()+" Y " + jugador8.getNombre());
        System.out.println("-------------------------------------");*/
//        JOptionPane.showMessageDialog(null,"Equipo 1 : "+ equipo1.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 2 : "+ equipo2.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 3 : "+ equipo3.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 4 : "+ equipo4.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 5 : "+ equipo5.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 6 : "+ equipo6.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 7 : "+ equipo7.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo 8 : "+ equipo8.getNombre());
//        JOptionPane.showMessageDialog(null,"Equipo ganador es : ");
//        
    }
}

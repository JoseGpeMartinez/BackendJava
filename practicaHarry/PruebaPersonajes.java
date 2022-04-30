package practicaHarry;

public class PruebaPersonajes {
    public static void main(String[] args) { // vamos a tener una clase estatica llamada main clase principal
        def();
    }

    public static void def(){  //asigna el metodo
        //personaje 1
        Personaje Harry = new Personaje();
        Harry.setNombre("Harry");
        Harry.setGenero("Hombre");
        Harry.setBoggart("Dementor");
        Harry.setPatronus("Ciervo");
        //personaje 2
         Personaje Ron = new Personaje();
         Ron.setNombre("Ron");
         Ron.setGenero("Hombre");
         Ron.setBoggart("Acromantula");
         Ron.setPatronus("Jack Rusell");

        //personaje 3
        Personaje Hermione = new Personaje();
        Hermione.setNombre("Hermione");
        Hermione.setGenero("Mujer");
        Hermione.setBoggart("Ninguno");
        Hermione.setPatronus("Nutria");

        //personaje 4
        Personaje Dumbledore = new Personaje();
        Dumbledore.setNombre("Dumbledore");
        Dumbledore.setGenero("Hombre");
        Dumbledore.setBoggart("Ariana");
        Dumbledore.setPatronus("Fenix");

        //personaje 5
        Personaje Ginny = new Personaje();
        Ginny.setNombre("Ginny");
        Ginny.setGenero("Mujer");
        Ginny.setBoggart("Voldemore");
        Ginny.setPatronus("Caballo");

        String msg = "*****Personaje 1******";
        msg += "\n Nombre:  " +Harry.getNombre();
        msg += "\n Genero:  " +Harry.getGenero();
        msg += "\n Boggart:  " +Harry.getBoggart();
        msg += "\n Patronus:  " +Harry.getPatronus();

        String msg2 = "\n *****Personaje 2******";
        msg2 += "\n Nombre:  "+ Ron.getNombre();
        msg2 += "\n Genero:  "+ Ron.getGenero();
        msg2 += "\n Bogart:  "+ Ron.getBoggart();
        msg2 += "\n Patronus:  "+ Ron.getPatronus();

        String msg3 = "\n *****Personaje 3******";
        msg3 += "\n Nombre:  "+ Hermione.getNombre();
        msg3 += "\n Genero:  "+ Hermione.getGenero();
        msg3 += "\n Bogart:  "+ Hermione.getBoggart();
        msg3 += "\n Patronus:  "+ Hermione.getPatronus();

        String msg4 = "\n *****Personaje 4******";
        msg4 += "\n Nombre:  "+ Dumbledore.getNombre();
        msg4 += "\n Genero:  "+ Dumbledore.getGenero();
        msg4 += "\n Bogart:  "+ Dumbledore.getBoggart();
        msg4 += "\n Patronus:  "+ Dumbledore.getPatronus();

        String msg5 = "\n *****Personaje 5******";
        msg5 += "\n Nombre:  "+ Ginny.getNombre();
        msg5 += "\n Genero:  "+ Ginny.getGenero();
        msg5 += "\n Bogart:  "+ Ginny.getPatronus();
        msg5 += "\n Patronus:  "+ Ginny.getPatronus();



        System.out.println(msg);
        System.out.println(msg2);
        System.out.println(msg3);
        System.out.println(msg4);
        System.out.println(msg5);
    }
}

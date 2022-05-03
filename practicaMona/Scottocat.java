package practicaMona;

public class Scottocat extends Mona {
    String scottname;
    String scottHand;

    Scottocat(String octacat, String cuerpo, String colorRostro, String ojos, String pelo, String scottname, String scottHand) {
        super(octacat, cuerpo, colorRostro, ojos, pelo);
        this.scottname = scottname;
        this.scottHand = scottHand;
    }

    void displayScott() {
        System.out.println(octacat + " 5 " + "Mi Nombre es:  " + scottname + ", con cuerpo: " + cuerpo + ", mi rostro es de color:  " + colorRostro + ", mi ojos son: " + ojos + ", mi pelo es:  " + pelo + ", en mi mano tengo:  " + scottHand);
    }
}
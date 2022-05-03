package practicaMona;

public class Wilson extends Mona {
    String wilaname;
    String wilHand;

    Wilson(String octacat, String cuerpo, String colorRostro, String ojos, String pelo, String wilaname, String wilHand) {
        super(octacat, cuerpo, colorRostro, ojos, pelo);
        this.wilaname = wilaname;
        this.wilHand = wilHand;

    }

    void displayWil() {
        System.out.println(octacat + " 6 " + "Mi Nombre es:  " + wilaname + ", con cuerpo: " + cuerpo + ", mi rostro es de color:  " + colorRostro + ", mi ojos son: " + ojos + ", mi pelo es:  " + pelo + ", en mi mano tengo:  " + wilHand);
    }
}
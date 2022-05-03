package practicaMona;

public class OctabiWan extends Mona {
    String octaname;
    String octaHand;

    OctabiWan(String octacat, String cuerpo, String colorRostro, String ojos, String pelo,String octaname, String octaHand) {
        super(octacat, cuerpo, colorRostro, ojos, pelo);
        this.octaname = octaname;
        this.octaHand = octaHand;

    }

    void displayOcta(){
        System.out.println(octacat+" 2 "+"Mi Nombre es:  "+octaname+ ", con cuerpo: "+cuerpo+ ", mi rostro es de color:  "+colorRostro+", mi ojos son: "+ojos+", mi pelo es:  "+pelo+ ", en mi mano tengo:  "+octaHand);
    }

}

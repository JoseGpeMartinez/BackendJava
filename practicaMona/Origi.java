package practicaMona;

public class Origi extends Mona {
    String oriname;
    String orihand;

    Origi(String octacat, String cuerpo, String colorRostro, String ojos, String pelo, String oriname, String orihand) {
        super(octacat, cuerpo, colorRostro, ojos, pelo);
        this.oriname = oriname;
        this.orihand = orihand;


    }

  void displayOrigi() {
      System.out.println(octacat+" 1 "+"Mi Nombre es:  "+oriname+ ", con cuerpo: "+cuerpo+ ", mi rostro es de color:  "+colorRostro+", mi ojos son: "+ojos+", mi pelo es:  "+pelo+ ", en mi mano tengo:  "+orihand);
     }



}



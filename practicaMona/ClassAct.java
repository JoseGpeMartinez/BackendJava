package practicaMona;

public class ClassAct extends Mona{

    String classname;
    String classHand;

    ClassAct(String octacat, String cuerpo, String colorRostro, String ojos, String pelo, String classname, String classHand) {
        super(octacat, cuerpo, colorRostro, ojos, pelo);
        this.classname = classname;
        this.classHand = classHand;
    }

    void displayClass(){
        System.out.println(octacat+" 4 "+"Mi Nombre es:  "+classname+ ", con cuerpo: "+cuerpo+ ", mi rostro es de color:  "+colorRostro+", mi ojos son: "+ojos+", mi pelo es:  "+pelo+ ", en mi mano tengo:  "+classHand);
    }

}

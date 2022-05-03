package practicaMona;

public class Puppeteer extends Mona{
    String puppetname;
    String puppetHand;

    Puppeteer (String octacat, String cuerpo, String colorRostro, String ojos, String pelo,String puppetname, String puppetHand) {
        super(octacat, cuerpo, colorRostro, ojos, pelo);
        this.puppetname = puppetname;
        this.puppetHand = puppetHand;

    }


    void displayPuppet(){
        System.out.println(octacat+" 3 "+"Mi Nombre es:  "+puppetname+ ", con cuerpo: "+cuerpo+ ", mi rostro es de color:  "+colorRostro+", mi ojos son: "+ojos+", mi pelo es:  "+pelo+ ", en mi mano tengo:  "+puppetHand);
    }

}








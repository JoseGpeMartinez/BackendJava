package practicaMona;

public class PersonajesMona {
    public static void main(String[] args) {
        Origi o = new Origi("Original", "Negro", "Durazno", "Abiertos", "Corto", "Original", "gota de agua");
        o.displayOrigi();

        OctabiWan w = new OctabiWan("  2", "con tunica jedi", "Beige", "Abiertos", "Corto con gorro jedi", "Octabiwan", "Arma jedi");
        w.displayOcta();

        Puppeteer p = new Puppeteer("  4", "Negro", "Beige", "Abiertos", "Corto con sombrero", "Puppeteer", "Titere");
        p.displayPuppet();

        ClassAct c = new ClassAct("  4", "Negro", "Durazno", "Abiertos cin un monoculo", "Corto con sombrero", "Class Act", "Martini");
        c.displayClass();

        Scottocat s = new Scottocat("  5", "traje sastre", "beige", "Abiertos ", "Corto ", "Scottcat", "Sobre");
        s.displayScott();

        Wilson will = new Wilson("  6", "traje beisbolista", "Durazno", "Abiertos medio", "Corto con gorra", "Wilson", "Pelota");
        will.displayWil();



    }
}
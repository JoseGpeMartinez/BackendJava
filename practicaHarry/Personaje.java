package practicaHarry;


public class Personaje {



    private String nombre;
    private String genero;
    private String boggart;
    private String patronus;

    public Personaje(String nombre, String genero, String boggart, String patronus){
        this.nombre = nombre;
        this.genero = genero;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public Personaje() {

    }

    public String getNombre(){ return nombre; }
    public String getGenero(){ return genero; }
    public String getBoggart(){ return boggart; }
    public String getPatronus(){ return patronus; }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
   /* public boolean setNombre(String nombre){
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
*/
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;

    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else
            return false;

    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;

    }

    public String showMessage() {
        return
                "nombre: " + nombre +
                        "\nGenero: " + genero +
                        "\nPoggart: " + boggart +
                        "\nPatronus: " + patronus + "\n";

    }

}

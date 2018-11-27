import java.util.ArrayList;

public class Comprador extends Usuario_Participante {

    private ArrayList<Puja> misPujas;

    public Comprador(String nombre, String contraseña, Integer id)
    {
        super(nombre, contraseña, id);
       this.misPujas = new ArrayList<Puja>();
    }


}

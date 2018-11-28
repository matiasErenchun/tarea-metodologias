import java.util.ArrayList;

public class Comprador extends Usuario_Participante {

    private ArrayList<Puja> misPujas;

    public Comprador(String nombre, String contraseña, Integer id)
    {
        super(nombre, contraseña, id);
       this.misPujas = new ArrayList<Puja>();
    }

    public void mostrarMisPujas()
    {
        for (Puja puja:this.misPujas) {
            puja.mostrarInformacionDePuja();
        }
    }

    public boolean agregarPuja(String contraseña, Puja puja)
    {
        if(this.validarContraseña(contraseña))
        {
            this.misPujas.add(puja);
            return true;
        }
        return false;//contraseña erronea.
    }
}

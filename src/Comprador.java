import java.util.ArrayList;

public class Comprador {
    private String nombre;
    private String contraseña;
    private ArrayList<Puja> misPujas ;
    private Integer id;
    public Comprador(String nombre, String contraseña, Integer id)
    {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.id = id;
        this.misPujas = new ArrayList<Puja>();

    }

    public void mostrarMisPujas()
    {

    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public boolean validarContraseña(String contraseña)
    {
        if(this.contraseña.equals(contraseña))
        {
            return true;
        }
        return false;
    }

    public void cambiarContraseña()
    {

    }
}

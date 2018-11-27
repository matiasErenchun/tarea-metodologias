
abstract public class Usuario_Participante
{
    private String nombre;
    private String contraseña;
    private Integer id;
    public Usuario_Participante(String nombre, String contraseña, Integer id)
    {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.id = id;
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

    public void cambiarContraseña(String contraseñaActual, String nuevaContraseña)
    {
        if(this.validarContraseña(contraseñaActual))
        {
            this.contraseña = nuevaContraseña;
            System.out.println("contraseña cambiada con exito");
        }

        System.out.println(" contraseña actual erronea , intente nuevamente");
    }

}

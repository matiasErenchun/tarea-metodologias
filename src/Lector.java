import java.util.Scanner;

public class Lector
{
    private Scanner lector;
    public Lector()
    {
        this.lector = new Scanner(System.in);
    }

    public String leerContraseña()
    {
        String contraseña = this.lector.nextLine();
        while(contraseña.equals("")|| contraseña.equals(null)|| contraseña.length()<6)
        {
            System.out.println(" contraseña muy corta, por favor ingrese una con mas de 6 caracteres");
            contraseña = this.lector.nextLine();
        }
        return contraseña;
    }
    /// hola 

}

import java.util.ArrayList;

public class Sistema
{
    private Lector lector;
    private Integer id;
    //private falta el hash set de compradores y vendedores
    public Sistema()
    {
        this.lector = new Lector();
        this.id=1;
    }

    public void menuPrincipal()
    {
        int numero;
        boolean seguir =true;
        while(seguir)
        {
            this.mostrarMenuPrincipal();
            numero = this.lector.leerNumero("ingrese el numero de la opcion que dese ejecutar");
            switch (numero) {
                case 0:
                    seguir=false;
                    System.out.println(" sitema lo regresara ala pantalla principal, gracias.");
                    break;
                case 1:

                    break;
                default:
                    System.out.println("opcion no valida ingrese una nueva que si sea valida");
                    break;
            }
        }
    }
   public void mostrarMenuPrincipal()
   {
       System.out.println("ingrese 1 si desea crear una cuenta");
       System.out.println("ingrese 0 si desea salir del sistema");
   }

   public Usuario_Participante crearCuenta()
   {
        int numero = this.lector.leerNumero("ingrese 1 para cuenta de vendedro, 2 para cuenat de comprador");

         if(numero==1)
         {
             String nombre = this.lector.leerContraseña();
             String contraseña = this.lector.leerContraseña();
             Vendedor vendedor = new Vendedor(nombre, contraseña, this.id);
             this.id++;
             return vendedor;
             //falta agregar al has set
         }
         else
             {
                String nombre=this.lector.leerContraseña();
                String contraseña=this.lector.leerContraseña();
                Comprador comprador=new Comprador(nombre,contraseña,this.id);
                this.id++;
                return comprador;
             }


   }

}

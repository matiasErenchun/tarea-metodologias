import java.util.ArrayList;

public class Vendedor extends Usuario_Participante
{
    private ArrayList<Producto> misProductos;
    public Vendedor(String nombre, String contraseña, Integer id)
    {
        super(nombre, contraseña, id);
        this.misProductos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto )
    {
        this.misProductos.add(producto);
    }

   /* public Producto eliminarProducto()
    {
        return Producto producto = new Producto();
    }
    */

    //public void editar producto()
}

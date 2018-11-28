import java.util.ArrayList;

public class Vendedor extends Usuario_Participante
{
    private ArrayList<Producto> misProductos;
    public Vendedor(String nombre, String contraseña, Integer id)
    {
        super(nombre, contraseña, id);
        this.misProductos = new ArrayList<Producto>();
    }

    public boolean agregarProducto(String contraseña,Producto producto )
    {
        if(this.validarContraseña(contraseña))
        {
            this.misProductos.add(producto);
            return true;

        }
        return false;//contraseña erronea no se agrega el producto
    }

    public void mostrarMisProductos()
    {
        for (Producto producto:this.misProductos)
        {
            producto.mostrarInformacionProducto();
        }
    }

    // cuando se use el metodo primero validar si existe el producto aun asi  se asumio que no se valida y se creo un caso de error .
    public Producto buscarProducto(Integer idProducto)
    {
        int i=0;
        Producto contenedorProducto = new Producto(00,"error","error",00);
        boolean buscar = true;
        while(buscar)
        {
            contenedorProducto = this.misProductos.get(i);
            if(contenedorProducto.getIdProducto().equals(idProducto))
            {
                buscar=false;

            }
            i++;
        }
        return contenedorProducto;

    }

   /* public Producto eliminarProducto()
    {
        return Producto producto = new Producto();
    }
    */

    //public void editar producto()
}

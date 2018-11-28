import java.util.ArrayList;

public class Producto
{
    private Integer idVendedor;
    private String nombre;
    private String descripcion;
    private Integer idProducto;
    private ArrayList<Puja> pujasPorElProducto;
    private Boolean estado;
    //lista de imagenes.


    public Producto(Integer idVendedor, String nombre, String descripcion, Integer id)
    {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idProducto = id;
        this.pujasPorElProducto = new ArrayList<Puja>();
        this.estado = false;
    }

    public Integer getIdVendedor()
    {
        return this.idVendedor;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public Integer getIdProducto()
    {
        return this.idProducto;
    }

    public void mostrarPujas()
    {
        for (Puja puja: this.pujasPorElProducto)
        {
            puja.mostrarInformacionDePuja();
        }
    }

    public void agregarPuja(Puja puja)
    {
        this.pujasPorElProducto.add(puja);
    }

    public void mostrarInformacionProducto()
    {
        System.out.println("nombre del producto: "+this.nombre);
        System.out.println("descripcion del producto: "+this.descripcion);
        System.out.println("ID del producto: "+this.idProducto);
        System.out.println("ID del vendedor: "+this.idVendedor);
        System.out.println("cantidad de pujas :"+this.cantidadDePujas());

    }

    public int cantidadDePujas()
    {
        return this.pujasPorElProducto.size();
    }


}

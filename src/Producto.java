import java.util.ArrayList;

public class Producto
{
    private Integer idVendedor;
    private String nombre;
    private String descripcion;
    private Integer id;
    private ArrayList<Puja> pujasPorElProducto;
    //lista de imagenes.


    public Producto(String nombre, String descripcion, Integer id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.pujasPorElProducto = new ArrayList<Puja>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }
}

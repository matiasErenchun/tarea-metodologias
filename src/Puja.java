
public class Puja
{
    private Integer valorPuja;
    private Integer idComprador;

    public Puja(Integer valorPuja, Integer idComprador)
    {
        this.valorPuja = valorPuja;
        this.idComprador = idComprador;
    }

    public Integer getValorPuja()
    {
        return valorPuja;
    }

    public Integer getIdComprador()
    {
        return idComprador;
    }

    public void mostrarInformacionDePuja()
    {
        System.out.println("comprador "+this.getIdComprador());
        System.out.println("valor de la oferta "+this.getValorPuja());
    }
}

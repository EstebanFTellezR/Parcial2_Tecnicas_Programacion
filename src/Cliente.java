import java.util.LinkedList;

public class Cliente {

    /*
    Atributos de la clase
     */
    private String nombre;
    private String direccionEnvio;
    private LinkedList <String> listaPedidos = new LinkedList<>();


    /*
    Constructor de la clase Cliente
     */
    public Cliente () {
    }

    /*
    Metodo que guarda el pedido en la Lista "listaPedidos"
     */
    public void guardarPedido (String pedido) {
        listaPedidos.add(pedido);
    }
}

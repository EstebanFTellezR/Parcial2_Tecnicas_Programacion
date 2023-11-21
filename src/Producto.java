import java.util.Scanner;
public class Producto {

    /*
    Atributos de la clase Producto
     */
    private String nombre;
    private String descripcion;
    private String precio;
    private String cantidadInventario;

    /*
    Metodo el cual muestra las opciones de compra para el usuario
     */
    public void getTelefono () {

        Scanner sc = new Scanner (System.in);

        System.out.println("Seleccione el nombre del telefono para ver sus detalles: \n 1. Galaxy Z Flip5");
        int contador = sc.nextInt();

        switch (contador){
            case 1:

                nombre = "Galaxy Z Flip5";
                    System.out.println("Nombre: \n" +nombre);
                descripcion = " El mejor telefono del mundo: \n - Tamaño Pantalla. 6.7”FHD+ 3.4”cover. \n - Memoria Ram. 8 GB. \n - Camara. 12MP WIDE 12MP UW. \n - Conectividad. 5G. \n - Memoria interna. 512 GB. \n - Procesador. Qualcomm Snapdragon 8 Gen 2.";
                    System.out.println("Descripción: \n" +descripcion);
                precio = "$5.399.928";
                    System.out.println("Precio: \n" +precio);
                cantidadInventario = "6000 mil unidades disponibles";
                    System.out.println("Cantidad de unidades: \n" + cantidadInventario+ "\n");

                System.out.println("¿Desea comprarlo? : \n 1. Si \n 2. No");
                int aux = sc.nextInt();

                if (aux == 1){

                    String pedido = "Galaxy Z Flip5";

                    Cliente guardarPedido = new Cliente();
                    guardarPedido.guardarPedido(pedido);
                }else {
                    System.out.println("Muchas gracias por su tiempo");
                }
                break;

            case 2:
                break;
            case 3:
                break;
        }
    }


    /*
    Constructor de la clase Producto
     */
    public Producto() {
        getTelefono();
    }
}

import java.util.Scanner;
public class Pedido {


    /*
    Metodo para preguntar que desea buscar
     */
    public void setPedido () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione lo que desea ordenar: \n 1. Telefonos \n 2. Laptops \n 3. Accesorios");
        int contador = sc.nextInt();

        switch (contador) {
            case 1:

                Telefono orden = new Telefono();

                break;
            case 2:

                Laptop orden1 = new Laptop();

                break;
            case 3:

                Accesorios orden2 = new Accesorios();

                break;
            default:
                System.out.println("!NÚMERO INVALIDO¡");
                break;
        }
    }

    /*
    Constructor de la clase Pedido
     */
    public Pedido (){
        setPedido();
    }
}

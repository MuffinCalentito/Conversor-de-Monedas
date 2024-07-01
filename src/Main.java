import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner leer = new Scanner(System.in);
        BuscarMoneda buscar = new BuscarMoneda();
        int opcion = 0;
        while(opcion != 7){
            System.out.println("*------------------------------------------*");
            System.out.println("    Bienvenido/a al conversor de monedas");
            System.out.println("Elija la opción que desee:");
            System.out.println("1. Dolár ------------> Peso argentino");
            System.out.println("2. Peso argentino ---> Dolár");
            System.out.println("3. Dólar ------------> Real brasileño");
            System.out.println("4. Real brasileño ---> Dólar");
            System.out.println("5. Dólar ------------> Peso colombiano");
            System.out.println("6. Peso colombiano --> Dolar");
            System.out.println("7. Salir");
            System.out.println("*------------------------------------------*");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", buscar, leer);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", buscar, leer);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", buscar, leer);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", buscar, leer);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", buscar, leer);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", buscar, leer);
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro servicio....");
                    break;
                default:
                    System.out.println("La opción elegida no es valida, se procede a cerrar el programa");
                    break;
            }

        }




    }
}

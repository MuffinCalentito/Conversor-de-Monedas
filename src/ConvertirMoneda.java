import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaIn, String monedaOut, BuscarMoneda buscar, Scanner leer){
        double valor;
        double valorConvertido;

        Moneda monedas = buscar.buscarMoneda(monedaIn, monedaOut);
        System.out.println("*------------------------------------------*");
        System.out.println("El cambio para el dia de hoy es\n1 "+monedaIn+ " = "+monedas.conversion_rate()+" "+monedaOut);
        System.out.println("*------------------------------------------*");
        System.out.println("Ingrese la cantidad de " + monedaIn);
        valor = Double.parseDouble(leer.nextLine());
        valorConvertido = valor * monedas.conversion_rate();
        System.out.println("*------------------------------------------*");
        System.out.println(valor+" "+monedaIn+" = "+valorConvertido+" "+monedas.target_code());
    }

}

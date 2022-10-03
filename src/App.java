import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        int mes;
        System.out.println("Digite de 1 até 12 para saber o mês:");
        mes = teclado.nextInt();

        while (true) {
            
            switch (mes) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Fev");
                    break;
                case 3:
                    System.out.println("Mar");
                    break;
                case 4:
                    System.out.println("Abr");
                    break;
                case 5:
                    System.out.println("Mai");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Jul");
                    break;
                case 8:
                    System.out.println("Ago");
                    break;
                case 9:
                    System.out.println("Set");
                    break;
                case 10:
                    System.out.println("Out");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dez");
                    break;
                default:
                    System.out.println("Escolha um número válido, ou 0 para encerrar");
                    break;
            }
            System.out.println("Digite de 1 até 12 para saber o mês:");
            mes = teclado.nextInt();
            if (mes == 0) break;
        }
        
        System.out.println("Saindo...");

    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean input = false;
        String[] Concessionaria = {""};
        int count = Concessionaria.length - 1;
        do {

            System.out.println("1- aggiunta di una nuova auto");
            System.out.println("2- visualizzazione di tutte le auto");
            System.out.println("3- ricerca di un'auto tramite marca e modello");
            System.out.println("4- cancellazione di un'auto");
            System.out.println("5- modifica dei dati di un'auto");
            System.out.println("6- visualizzazione delle auto in ordine crescente");
            System.out.println("7- visualizzare tutti i modelli che diesel");
            System.out.println("0- esci dalla concessionaria");

            int scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    input=true;
                    break;

            }
        }while (!input);
    }
}
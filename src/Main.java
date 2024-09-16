import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean input = false;
        String[] Marca = {""};
        String[] Modello = {""};
        String[] Prezzo = {""};
        do {

            System.out.println("1- Aggiunta di una nuova auto");
            System.out.println("2- Visualizzazione di tutte le auto");
            System.out.println("3- Ricerca di un'auto tramite marca e modello");
            System.out.println("4- Rimozione di un'auto");
            System.out.println("5- Modifica dei dati di un'auto");
            System.out.println("6- Visualizzazione delle auto in ordine crescente");
            System.out.println("7- Visualizzare tutti i modelli che utilizzano diesel");
            System.out.println("0- Esci dal concessionario");

            int scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Aggiungi un veicolo: ");
                    System.out.println("Marca: ");
                    String marca = in.next();
                    System.out.println("Modello: ");
                    String modello = in.next();
                    System.out.println("Prezzo: ");
                    String prezzo = in.next();
                    Functions.AggiungiVeicolo(Marca,Modello,Prezzo,marca,modello,prezzo);
                    break;
                case 2:
                    Functions.VisualizzaConcessionario(Marca,Modello,Prezzo);
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
                    input = true;
                    break;
            }
        }while(!input);
    }
}
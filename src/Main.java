import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean input = false;
        String[] arrayMarca = new String[10];
        String[] arrayModello = new String[10];
        String[] arrayPrezzo = new String[10];
        int count = 0;
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
                    Functions.AggiungiVeicolo(arrayMarca,arrayModello,arrayPrezzo,marca,modello,prezzo, count);
                    count++;
                    break;
                case 2:
                    Functions.VisualizzaConcessionario(arrayMarca,arrayModello,arrayPrezzo);
                    break;
                case 3:
                    if (count==0){
                        System.out.println("Non ci sono auto nel concessionario, inseriscine una");
                        break;
                    }
                    System.out.println("Ricerca un auto, inserisci la marca: ");
                    marca = in.next();
                    System.out.println("Ora inserisci il modello: ");
                    modello = in.next();
                    int posizione = Functions.RicercaAuto(arrayMarca, arrayModello, marca, modello);
                    if (posizione == -1){
                        System.out.println(marca + " " + modello + " non è stata trovata");
                    } else {
                        System.out.println(marca + " " + modello + " " + arrayPrezzo[posizione] + " è presente e si trova in posizione:" + " " + posizione);
                    }
                    break;
                case 4:
                    if (count==0){
                        System.out.println("Non ci sono auto nel concessionario, inseriscine una");
                        break;
                    }

                    int RicercaDaEliminare=-1;
                    System.out.println("Inserisci la marca dell'auto da mandare al bar: ");
                    marca = in.next();
                    System.out.println("Ora inserisci il modello: ");
                    modello = in.next();
                    System.out.println("Ora inserisci il prezzo: ");
                    prezzo = in.next();

                    for (int i = 0; i < count; i++){
                        if (arrayMarca[i].equalsIgnoreCase(marca) && arrayModello[i].equalsIgnoreCase(modello) && arrayPrezzo[i].equalsIgnoreCase(prezzo)){
                            RicercaDaEliminare=i;
                            break;
                        }
                    }
                    if (RicercaDaEliminare==-1){
                        System.out.println("Non è presente un'auto con questi dati");
                    }
                    count = Functions.EliminaAuto(arrayMarca,arrayModello,arrayPrezzo,RicercaDaEliminare,count);
                    break;
                case 5:
                    System.out.println("Modifica dei dati di un auto, inserisci la marca da sostituire: ");
                    marca = in.next();
                    System.out.println("Inserisci il modello da sostituire: ");
                    modello = in.next();
                    System.out.println("Inserisci il prezzo da sostituire: ");
                    prezzo = in.next();
                    System.out.println("Ora puoi modificare i dati della marca: ");
                    String newmarca = in.next();
                    System.out.println("Inserisci il modello da sostituire: ");
                    String newmodello = in.next();
                    System.out.println("Inserisci il prezzo da sostituire: ");
                    String newprezzo = in.next();
                    Functions.ModificaDati(arrayMarca, arrayModello, arrayPrezzo,marca,modello,prezzo,newprezzo,newmarca,newmodello);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    input = true;
                    System.out.println("Stai uscendo dal concessionario...");
                    break;
            }
        }while(!input);
    }
}
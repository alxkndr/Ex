public class Functions {
    public static void AggiungiVeicolo(String[]Marca, String[]Modello, String[]Prezzo, String marca, String modello, String prezzo){
        for (int i = 0; i < Marca.length; i++){
            Marca[i] = marca;
        }
        for (int i = 0; i < Modello.length; i++){
            Modello[i] = modello;
        }
        for (int i = 0; i < Prezzo.length; i++){
            Prezzo[i] = prezzo;
        }
    }
    public static void VisualizzaConcessionario(String[]Marca, String[]Modello, String[]Prezzo){
        for (int i = 0; i < Marca.length; i++){
            System.out.println(Marca[i]+ " ");
        }
        for (int i = 0; i < Modello.length; i++){
            System.out.println(Modello[i]+ " ");
        }
        for (int i = 0; i < Prezzo.length; i++){
            System.out.println(Prezzo[i]+ " ");
        }
    }
}

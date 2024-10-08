public class Functions {
    public static void AggiungiVeicolo(String[]Marca, String[]Modello, String[]Prezzo, String marca, String modello, String prezzo, int count){
            Marca[count] = marca;
            Modello[count] = modello;
            Prezzo[count] = prezzo;
    }
    public static void VisualizzaConcessionario(String[]arrayMarca, String[]arrayModello, String[]arrayPrezzo){
        for (int i = 0; i < arrayMarca.length; i++){
            if (arrayMarca[i] == null){
                break;
            }
            else {
                System.out.println(arrayMarca[i]+ " " + arrayModello[i] + " " + arrayPrezzo[i]);
            }
        }
    }
    public static int RicercaAuto(String[]arrayMarca,String[]arrayModello, String marca, String modello){
        int posizione = -1;
        for (int i = 0; i < arrayMarca.length; i++){
            if (marca.equalsIgnoreCase(arrayMarca[i]) && modello.equalsIgnoreCase(arrayModello[i])){
                posizione = i;
            }
        }
        return posizione;
    }
    public static int EliminaAuto(String[]arrayMarca,String[]arrayModello, String[]arrayPrezzo, int ricercadaeliminare, int count){
            for (int i = ricercadaeliminare; i < count; i++){
                arrayMarca[i] = arrayMarca[i+1];
                arrayModello[i] = arrayModello[i+1];
                arrayPrezzo[i] = arrayPrezzo[i+1];
            }
            count = count-1;
            return count;
        }
    public static void ModificaDati(String[]arrayMarca,String[]arrayModello, String[]arrayPrezzo, String marca, String modello, String prezzo, String newprezzo, String newmodello, String newmarca){
        for (int i = 0; i < arrayMarca.length; i++){
            if(marca.equalsIgnoreCase(arrayMarca[i])){
                arrayMarca[i]=newmarca;
            }
            if(modello.equalsIgnoreCase(arrayModello[i])){
                arrayModello[i]=newmodello;
            }
            if(prezzo.equalsIgnoreCase(arrayPrezzo[i])){
                arrayPrezzo[i]=newprezzo;
            }
        }
    }
}

public class Functions {
    public static String[] AggiungiVeicolo(String[]Concessionario, String veicolo){
        for (int i = 0; i < Concessionario.length; i++){
            Concessionario[i] = veicolo;
        }
        return Concessionario;
    }
}

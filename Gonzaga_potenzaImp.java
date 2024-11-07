//Edward Gonzaga 4INF.D
//Titolo: Funzionamento della potenza in modo sequenziale 

/*- VERSIONE 1: usando il metodo sequenziale

	dichiarare le variabili;
	chiedere all'utente i valori delle due variabili;
	fare un controllo sull'esponente;
	creare un for dove assegno alla variabile "risultato" il valore di risultato * base;
	stampare il valore "risultato";
*/

//Importo la classe scanner
import java.util.Scanner;

public class Gonzaga_potenzaImp {

    public static void main(String[] args) {
       
        //Dichiaro e inizializzo le variabili 
        int base;
        int potenza;
        int risultato = 1;
        
        //Chiedo all'utente il valore della base
        Scanner InputBase = new Scanner(System.in);
        System.out.println("Inserisci il valore della base: ");
        
        //Assegno alla variabile "base" il valore dato dall'utente
        base = InputBase.nextInt();
        
        //Chiedo all'utente il valore della potenza
        Scanner InputPotenza = new Scanner(System.in);
        System.out.println("Inserisci il valore della potenza: ");
        
        //Assegno alla variabile "potenza" il valore dato dall'utente
        potenza = InputPotenza.nextInt();
        
        //Creo un for dove eseguiamo il calcolo della potenza
        for (int i = 0; i < potenza; i++){
            
            risultato = risultato * base;
            
        }
        
        //Stampo il valore della variabile "risultato"
        System.out.println("Il valore della potenza e': " + risultato);
    }
}
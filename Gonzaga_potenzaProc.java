//Edward Gonzaga 4INF.D
//Titolo: Funzionamento della potenza in modo procedurale 

/*- VERSIONE 2: usando il metodo procedurale

	Nella classe "Gonzaga_potenzaProc" inizializzo e dichiaro le variabili;
        Creo la funzione "Input";
        Chiedo all'utente il valore della base e dell'esponente;
        Assegno i valori dati dall'utente nelle variabili "base" e "esponente";
        Creo la funzione "Calcolo";
        Creo il ciclo for che esegue il calcolo della potenza;
        Stampo la variabile "risultato";
        Nel main istanzio un oggetto;
        Richiamo le 2 funzioni;
        
*/

package com.mycompany.procedurale;

//Classe Scanner
import java.util.Scanner;


public class Gonzaga_potenzaProc {
    
    //Dichiaro e inizializzo le variabili 
    public int base = 0;
    public int esponente = 0;
    public int risultato = 1;
    
    //Creo la funzione "Input"
    public void Input () {
        
        //Chiedo all'utente il valore della base
        Scanner InputBase = new Scanner(System.in);
        System.out.println("Inserisci il valore della base: ");
        
        //Assegno alla variabile "base" il valore dato dall'utente
        base = InputBase.nextInt();
        
        //Chiedo all'utente il valore dell'esponente
        Scanner InputEsponente = new Scanner(System.in);
        System.out.println("Inserisci il valore della potenza: ");
        
        //Assegno alla variabile "esponente" il valore dato dall'utente
        esponente = InputEsponente.nextInt();
        
    }
    
    //Creo la funzione "Calcolo"
    public void Calcolo () {
        
        //Creo un for dove eseguiamo il calcolo della potenza
        for (int i = 0; i < esponente; i++){
            
            risultato = risultato * base;
            
        }
        
        //Stampo il valore della variabile "risultato"
        System.out.println("Il valore della potenza e': " + risultato);
        
    }
    
    public static void main(String[] args) {
        
        //Istanzio un'oggetto
        Gonzaga_potenzaProc InputCalcolo = new Gonzaga_potenzaProc ();
     
        //Richiamo alla funzione "Input"
        InputCalcolo.Input();
        
        //Richiamo alla funzione "Calcolo"
        InputCalcolo.Calcolo();
           
    }
}

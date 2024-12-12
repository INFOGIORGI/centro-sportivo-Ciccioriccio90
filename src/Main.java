import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String path = "input.txt";
        CentroSportivo c = new CentroSportivo();
        input(path, c);




    }
    public static void input(String percorso, CentroSportivo c) {
        File file = new File(percorso);
        try (Scanner tScanner = new Scanner(file)) { 
            while (tScanner.hasNextLine()) {
                String s = tScanner.nextLine();
                String[] sp = s.split(";");
                
                // Verifica del tipo di record
                if (sp[0].equals("I")) {
                    // Istruttore: ID, Nome, Cognome
                    c.aggiungiIstruttore(sp[1], sp[2], sp[3]);
                    System.out.println("aggiunto istruttore");
                } else if (sp[0].equals("S")) {
                    // Socio: ID, Nome, Cognome
                    c.aggiungiSocio(sp[1], sp[2], sp[3]);
                    System.out.println("aggiunto socio");
                } else if (sp[0].equals("A")) {
                    // Assegnazione Istruttore: ID Socio, ID Istruttore
                    c.assegnaIstruttore(sp[1], sp[2]);
                    System.out.println("istruttore assegnato");
                } else if (sp[0].equals("AT")) {
                    // Attività: ID Socio, ID Istruttore, Data, Ora Inizio, Ora Fine, Descrizione
                    c.AggiungiAttivita(sp[1], sp[2], sp[3], sp[4], sp[5], sp[6]);
                    System.out.println("aggiunta attivita");
                } 
            }
        } catch (Exception e) {
           // TODO: handle exception
        }
    }
    
    }

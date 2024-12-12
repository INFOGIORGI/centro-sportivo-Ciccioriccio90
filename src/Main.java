import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String path = "";
        CentroSportivo c = new CentroSportivo();
        input(path, c);



    }
    public static void input(String percorso, CentroSportivo c){
        File file = new File(percorso);
        try {
            Scanner tScanner = new Scanner(file);
            while (tScanner.hasNextLine()) {
                String s = tScanner.nextLine();
                String []sp = s.split(";");
                if(sp[1]=="I"){
                    
                    c.aggiungiIstruttore(sp[2], sp[3], sp[4]);
                }
                if(sp[1]=="S"){
                    
                    c.aggiungiSocio(sp[2], sp[3], sp[4]);
                }
                if(sp[1]=="A")
                    c.assegnaIstruttore(sp[2], sp[3]);
            }
            tScanner.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
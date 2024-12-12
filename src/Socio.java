
import java.util.HashMap;

public class Socio {
    private String nome; 
    private String cognome;
    private  String codSoc;
    private HashMap<String, Istruttore> listaistAssegnati;
    
    
    public Socio(String nome, String cognome, String codSoc) {
        this.nome = nome;
        this.cognome = cognome;
        this.codSoc = codSoc;
        this.listaistAssegnati=new HashMap<>();
    }

   public int getlenListIst(){
    return listaistAssegnati.size();
   }
    
   public Socio getSocio(){
    return this;
   }


   public boolean addIstruttore(Istruttore ist){
    if(listaistAssegnati.containsValue(ist)){
        return false;
    }else{
        listaistAssegnati.put(ist.getCodIst(), ist);
        return true;
    }
   }

    public String getCodSoc() {
        return this.codSoc;
    } 

    @Override
    public String toString() {
        return nome+" "+ cognome+" "+codSoc+"\n";
    }

    

    
}


import java.util.HashMap;
import java.util.LinkedList;

public class Socio {
    private String nome; 
    private String cognome;
    private  String codSoc;
    private HashMap<String, Istruttore> listaistAssegnati;
    private LinkedList<Attivita> attAssegnate;
   
    
    
    public Socio(String nome, String cognome, String codSoc) {
        this.nome = nome;
        this.cognome = cognome;
        this.codSoc = codSoc;
        this.listaistAssegnati=new HashMap<>();
        this.attAssegnate=new LinkedList<>();
    }

   public int getlenListIst(){
    return listaistAssegnati.size();
   }
    
   public Socio getSocio(){
    return this;
   }

   public boolean  removeIst(String codice){
    if(listaistAssegnati.containsKey(codice)){
        listaistAssegnati.remove(codice);
        return true;
    }
    return false;
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

    public void addAttivita(Attivita a){
        attAssegnate.add(a);
    }

    
}

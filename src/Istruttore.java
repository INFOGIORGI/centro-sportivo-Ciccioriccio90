import java.util.*;
public class Istruttore {
    private String nome; 
    private String cognome;
    private String codIst;
    private HashMap<String, Socio> listaSocAssegnati;
   
    
    
    public Istruttore(String nome, String cognome, String codIst) {
        this.nome = nome;
        this.cognome = cognome;
        this.codIst = codIst;
        this.listaSocAssegnati= new HashMap<>();
    }
    
    public int getlenListIst(){
        return listaSocAssegnati.size();
       }

    public Istruttore getIstruttore(){
        return this;
    }
   
   
       public String getCodIst() {
        return codIst;
    }

    public boolean addSocio(Socio soc){
        if(listaSocAssegnati.containsValue(soc)){
            return false;
        }else{
            listaSocAssegnati.put(soc.getCodSoc(), soc);
            return true;
        }
    }
    
    public boolean removeSocio(String codS){
        if(listaSocAssegnati.containsKey(codS)){
            listaSocAssegnati.remove(codS);
            return true;
        }else{
            return false;
        }
        
    }



    public String getSoci(){
        String retValue= "";
        for (Socio s : listaSocAssegnati.values()) {
            retValue+=s;
        }
        return retValue;
    }


    public boolean  hasSocio(String cod){
        if(listaSocAssegnati.containsKey(cod))
            return true;
        else
        return false;
        
    }

    @Override
    public String toString() {
        return nome+" "+ cognome+" "+codIst+"\n";
    }
    



        
}

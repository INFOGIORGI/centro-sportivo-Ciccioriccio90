import java.util.*;

public class CentroSportivo {
    private HashMap<String, Socio> listaSoci;
    private HashMap<String, Istruttore> listaIstruttori;
    private ArrayList<Attivita> listaAttivita;
    
    
    public CentroSportivo() {
        this.listaSoci = new HashMap<>();
        this.listaIstruttori = new HashMap<>();
        this.listaAttivita= new ArrayList<>();
    }

    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio) {
        if (listaSoci.containsKey(codiceSocio)) {
            return false;
        } else {
            Socio socio = new Socio(nome, cognome, codiceSocio);
            listaSoci.put(codiceSocio, socio);
            return true;
        }
    }

    public boolean aggiungiIstruttore(String nome, String cognome, String codiceIst) {
        if (listaIstruttori.containsKey(codiceIst)) {
            return false;
        } else {
            Istruttore istruttore = new Istruttore(nome, cognome, codiceIst);
            listaIstruttori.put(codiceIst, istruttore);
            return true;
        }
    }

    public boolean rimuoviSocio(String codice) {
        if (!listaSoci.containsKey(codice) || listaSoci.get(codice).getlenListIst() != 0) {
            return false;
        } else {
            listaSoci.remove(codice);
            return true;
        }
    }

    public boolean rimuoviIstruttore(String codice) {
        if (!listaIstruttori.containsKey(codice) || listaSoci.get(codice).getlenListIst() != 0) {
            return false;
        } else {
            listaSoci.remove(codice);
            return true;
        }
    }

    public boolean assegnaIstruttore(String codiceS, String codiceI) {
        if(!listaSoci.containsKey(codiceS) || !listaIstruttori.containsKey(codiceI) ){
            return false;
        } else {
            Socio s = listaSoci.get(codiceS);
            Istruttore i = listaIstruttori.get(codiceI);
            if (s.addIstruttore(i) == true && i.addSocio(s) == true) {
                s.addIstruttore(i);
                i.addSocio(s);
                return true;
            }else{ 
            return false;
            }
    }
}

    public boolean rimuoviAssegnazione(String codiceS, String codiceI) {
        if (listaIstruttori.containsKey(codiceI) && listaSoci.containsKey(codiceS)) {
            if (listaIstruttori.get(codiceI).removeSocio(codiceS) == true) {
                listaIstruttori.get(codiceI).removeSocio(codiceS);
                return true;
            }
        }
        return false;
    }




    public boolean AggiungiAttivita(String codS, String codI, String data, String orarioI, String orarioF, String descrizione){
        if(!listaIstruttori.get(codI).hasSocio(codS)){
            return false;
        }else{
            Attivita a = new Attivita(listaSoci.get(codS), listaIstruttori.get(codI), data, orarioI, orarioF, descrizione);
            listaAttivita.add(a);
            return true;
        }
    }


    public String getSoci(String cod){
        return listaIstruttori.get(cod).getSoci();
    }

    public String getSoci(){
        String retValue= "";
        for (Socio s : listaSoci.values()) {
            retValue+=s;
        }
        return retValue;
    }
    public String getIst(){
        String retValue= "";
        for (Istruttore i : listaIstruttori.values()) {
            retValue+=i;
        }
        return retValue;
    }



}

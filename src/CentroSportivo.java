import java.util.*;

public class CentroSportivo {
    private HashMap<String, Socio> listaSoci;
    private HashMap<String, Istruttore> listaIstruttori;

    public CentroSportivo() {
        listaSoci = new HashMap<>();
        listaIstruttori = new HashMap<>();
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
        if (listaIstruttori.containsKey(codiceI) && listaSoci.containsKey(codiceS)) {
            Socio s = listaSoci.get(codiceS);
            Istruttore i = listaIstruttori.get(codiceI);
            if (s.addIstruttore(i) == true && i.addSocio(s) == true) {
                s.addIstruttore(i);
                i.addSocio(s);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
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




    public boolean AggiungiAttivita(String codS, String codI, String data, String orarioI, String orarioF){
        
    }








}

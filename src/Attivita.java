public class Attivita {
    private Socio soc;
    private Istruttore ist;
    private String data;
    private String oraI;
    private String oraF;
    private String Descrizione;
    
    
    public Attivita(Socio soc, Istruttore ist, String data, String oraI, String oraF, String descrizione) {
        this.soc = soc;
        this.ist = ist;
        this.data = data;
        this.oraI = oraI;
        this.oraF = oraF;
        this.Descrizione = descrizione;
    }

    @Override
    public String toString() {
        return soc+"//"+ist+"//"+data+"//"+oraI+"//"+oraF+"//"+Descrizione+"\n";
    }

    public Socio getSoc() {
        return soc;
    }

    public Istruttore getIst() {
        return ist;
    }

    public String getData() {
        return data;
    }

    public String getOraI() {
        return oraI;
    }

    public String getOraF() {
        return oraF;
    }

    
    
    
}

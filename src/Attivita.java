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
    
}

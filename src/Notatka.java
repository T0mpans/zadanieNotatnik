import java.util.Date;

public class Notatka {
    public String tytulNotatki, trescNotatki;
    public boolean priorytet;
    public Date dataNotatki;

    public Notatka(String tytulNotatki, String trescNotatki, boolean priorytet, Date dataNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        this.priorytet = priorytet;
        this.dataNotatki = dataNotatki;
        //dataNotatki.getDate();
    }
}

import java.util.Date;

public class Notatka {
    public String tytulNotatki, trescNotatki;
    public boolean priorytet;
    public Date dataNotatki;

    public Notatka(String tytulNotatki, String trescNotatki, boolean priorytet) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        this.priorytet = priorytet;
        this.dataNotatki = new Date();
    }

    public Notatka(String tytulNotatki) {
        this.tytulNotatki = tytulNotatki;
        tytulNotatki = "";
        priorytet = false;
        dataNotatki = new Date();
    }


}

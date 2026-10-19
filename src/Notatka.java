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
        this.trescNotatki = "";
        this.priorytet = false;
        this.dataNotatki = new Date();
    }

    public void wypiszNotatke(){
        System.out.println("______________________");
        if(priorytet==true){
            System.out.println("Notatka WAŻNA! "+tytulNotatki);
        }else{
            System.out.println("Notatka "+tytulNotatki);
        }
        System.out.println(trescNotatki);
        System.out.println(dataNotatki);
        System.out.println("______________________");
    }
}

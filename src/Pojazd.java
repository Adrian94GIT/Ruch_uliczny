import java.util.ArrayList;

public class Pojazd {
    private String tabliceRejestracyjne ;
    private String aktualnaUlica;
    private String dzielnica ;

    public Pojazd (String tabliceRejestracyjne, Ulica ulica)
    {
        this.tabliceRejestracyjne = tabliceRejestracyjne;
        this.aktualnaUlica = ulica.getNazwa();
        ulica.addPojazd(this);
        this.dzielnica = ulica.getDzielnica();

    }

    public String getTabliceRejestracyjne() {
        return tabliceRejestracyjne;
    }

    public void setAktualnaUlica(Ulica ulica) {
        this.aktualnaUlica = ulica.getNazwa();
    }

    public String getAktualnaUlica() {
        return aktualnaUlica;
    }
    public void LokalizacjaPojazdu(){
        System.out.println("Auto znajduje się na ulicy " + this.aktualnaUlica + " w dzielnicy " + this.dzielnica);
    }
    public void LokalizacjaPoRejestracji(String tabliceRejestracyjne){
        System.out.println("Auto znajduje się na ulicy " + this.aktualnaUlica + " w dzielnicy " + this.dzielnica);
    }

}

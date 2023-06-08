import java.util.ArrayList;
import java.util.List;

public class Ulica {
    private String nazwa;
    private String dzielnica;

    private List<Pojazd> AutaNaUlicy;

    public Ulica ( String nazwa, Dzielnica dzielnica) {
        this.nazwa = nazwa;
        this.dzielnica = dzielnica.getNazwa();
        this.AutaNaUlicy = new ArrayList<>();
        dzielnica.addUlicaDoDzielnicy(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getDzielnica() {
        return dzielnica;
    }

    public  void addPojazd(Pojazd pojazd){
        AutaNaUlicy.add(pojazd);
    }

    public  void removePojazd(Pojazd pojazd){
        AutaNaUlicy.remove(pojazd);
    }

    public int IloscAut (){
        return AutaNaUlicy.size();
    }

    public void ListaAutNaUlicy()
    {
        System.out.println("Lista aut na ulicy "+ this.getNazwa() + ": ");
        for(Pojazd pojazd : AutaNaUlicy)
        {
            System.out.println(pojazd.getTabliceRejestracyjne());
        }
    }




}

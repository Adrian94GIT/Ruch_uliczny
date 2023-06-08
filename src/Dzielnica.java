import java.util.ArrayList;

public class Dzielnica {
    private String nazwa;
    private ArrayList<Ulica>SpisUlic;

    public Dzielnica(String nazwa){
        this.nazwa = nazwa;
        this.SpisUlic = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public  void addUlicaDoDzielnicy (Ulica ulica){
        SpisUlic.add(ulica);
    }

    public void wyswietlWszystkieUliceWDzielnicy ()
    {
        System.out.println("Ulice w dzielnicy "+ this.getNazwa() + ": ");
        for(Ulica ulica : SpisUlic)
        {
            System.out.println(ulica.getNazwa());
        }
    }
}

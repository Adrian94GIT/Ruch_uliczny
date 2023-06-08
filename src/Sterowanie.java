import java.util.ArrayList;
import java.util.List;

public class Sterowanie {
    private List<Pojazd> listaPojazdow;
    private List<Ulica> listaUlic;

    public Sterowanie() {
        listaPojazdow = new ArrayList<>();
        listaUlic = new ArrayList<>();
    }

    public void dodajUlice(Ulica ulica) {
        listaUlic.add(ulica);
    }

    public void dodajPojazd(Pojazd pojazd) {
        listaPojazdow.add(pojazd);
    }

    public Ulica najwiecejAutZnajdujacychSieNaUlicy() {
        int maxLiczbaAut = 0;
        Ulica ulicaZNajwiecejAutami = null;

        for (Ulica ulica : listaUlic) {
            int liczbaAut = 0;
            for (Pojazd pojazd : listaPojazdow) {
                if (pojazd.getAktualnaUlica().equals(ulica.getNazwa())) {
                    liczbaAut++;
                }
            }
            if (liczbaAut > maxLiczbaAut) {
                maxLiczbaAut = liczbaAut;
                ulicaZNajwiecejAutami = ulica;
            }
        }
        return ulicaZNajwiecejAutami;

    }

    public String szukaniePoNumerzeRejestracyjnym(String nrRejestracyjny) {
        String ulicaNaKtorejJestAuto = null;
        String ulicaZAutem = "";
        for (Pojazd pojazd : listaPojazdow) {
            if (pojazd.getTabliceRejestracyjne() == nrRejestracyjny) {
                ulicaZAutem = ulicaZAutem + pojazd.getAktualnaUlica();
            }
            ulicaNaKtorejJestAuto = ulicaZAutem;
        }
        return ulicaNaKtorejJestAuto;
    }
}
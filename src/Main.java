public class Main {
    public static void main(String[] args) {

        Dzielnica Teofilow = new Dzielnica("Teofilow");
        Dzielnica Baluty = new Dzielnica("Baluty");

        Ulica Rojna = new Ulica("Rojna", Teofilow);
        Ulica Traktorowa = new Ulica("Traktorowa", Teofilow);

        Ulica Limanowskiego = new Ulica("Limanowskiego", Baluty);
        Ulica Kasprzaka = new Ulica("Kasprzaka", Baluty);

        Pojazd auto1 = new Pojazd("EL123456", Rojna);
        Pojazd auto2 = new Pojazd("EKU65129", Traktorowa);
        Pojazd auto3 = new Pojazd("EBR459876", Limanowskiego);
        Pojazd auto4 = new Pojazd("WA759865", Kasprzaka);

        Skrzyzowanie Rojna_Traktorowa = new Skrzyzowanie("Rojna-Traktorowa", Rojna, Traktorowa);
        Skrzyzowanie Limanowskiego_Kasprzaka = new Skrzyzowanie("Limanowskiego-Kasprzaka", Limanowskiego, Kasprzaka);

        System.out.println(auto1.getTabliceRejestracyjne());
        System.out.println("//////////////////////////////");
        auto1.setAktualnaUlica(Traktorowa);
        System.out.println(auto1.getAktualnaUlica());
        System.out.println("//////////////////////////////");
        System.out.println(Rojna.getNazwa());
        System.out.println(Traktorowa.getDzielnica());
        Traktorowa.ListaAutNaUlicy();
        System.out.println(Traktorowa.IloscAut());
        Traktorowa.removePojazd(auto1);
        System.out.println("//////////////////////////////");
        System.out.println(Rojna_Traktorowa.getNazwa());
        System.out.println(Limanowskiego_Kasprzaka.getSkrzyzowanie());
        System.out.println("//////////////////////////////");
        Teofilow.wyswietlWszystkieUliceWDzielnicy();
        auto1.LokalizacjaPojazdu();

        auto3.LokalizacjaPoRejestracji("EBR459876");

        Sterowanie sterowanie = new Sterowanie();
        sterowanie.dodajPojazd(auto1);
        sterowanie.dodajPojazd(auto2);
        sterowanie.dodajPojazd(auto3);
        sterowanie.dodajPojazd(auto4);
        sterowanie.dodajUlice(Rojna);
        sterowanie.dodajUlice(Traktorowa);
        sterowanie.dodajUlice(Limanowskiego);
        sterowanie.dodajUlice(Kasprzaka);

        Ulica najwiecejAutZnajdujacychSieNaUlicy = sterowanie.najwiecejAutZnajdujacychSieNaUlicy();
        System.out.println("Ulica z największą liczbą pojazdów: "+najwiecejAutZnajdujacychSieNaUlicy.getNazwa() + " Znajduje się na niej: "+ najwiecejAutZnajdujacychSieNaUlicy.IloscAut());



        System.out.println("Auto o szukanej rejestracji znajduje sie na ulicy: " + sterowanie.szukaniePoNumerzeRejestracyjnym("EBR459876"));


        /*
        Gdzie znajduja sie korki
         */

    }
}
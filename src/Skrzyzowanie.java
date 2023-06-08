public class Skrzyzowanie {
    private String nazwa;
    String ulica1;
    String ulica2;

    public Skrzyzowanie ( String nazwa, Ulica ulica1, Ulica ulica2){
        this.nazwa = nazwa;
        this.ulica1 = ulica1.getNazwa();
        this.ulica2 = ulica2.getNazwa();

    }

    public String getNazwa() {
        return nazwa;
    }

    public String getSkrzyzowanie (){
        return "Skrzyżowanie ulic " + ulica1 + " i " + ulica2;
    }







}

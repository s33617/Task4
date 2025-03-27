public class Klient {
    int id; //identyfikator klienta
    String imie;
    String nazwisko;
    String email;
    boolean czyStaly; //czy klient jest stalym klientem
    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        czyStaly = false;
    }
}

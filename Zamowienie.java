public class Zamowienie {
    int id; //identyfikator zamowienia
    Klient klient;
    Produkt[] produkt;
    int[] ilosci; // tablica ilosci odpowiadajacych produktom
    String dataZamwienia;
    String status; //Status zamowienia
    public Zamowienie (int id, Klient klient, Produkt[] produkt, int[] ilosci) {
        this.id = id;
        this.klient = klient;
        this.produkt = produkt;
        this.ilosci = ilosci;
        this.dataZamwienia = "";
    }
}

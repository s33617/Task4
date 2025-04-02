import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();
    private ArrayList<Zamowienie> zamowienia = new ArrayList<>();
    private int liczbaProduktów = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }
    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }
    public void utworzZamowienie(Klient klienci, Produkt[] produkty, int[] ilosci){
        Zamowienie zamowienie = new Zamowienie(liczbaZamowien + 1, Klient, produkty, ilosci, "Nowe");
        zamowienia.add(zamowienie);
        liczbaZamowien++;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie){
        for (int i = 0; i < zamowienie.getProdukt().length; i++) {
            zamowienie.getProdukt()[i].setIloscWMagazynie(zamowienie.getProdukt()[i].getIloscWMagazynie() - zamowienie.getIlosc()[i]);
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equals(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta){
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getKlient().getId() == idKlienta) {
                zamowienie.wyswietlSzczegóły();
            }
        }
    }
}

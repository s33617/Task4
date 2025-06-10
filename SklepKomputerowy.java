import java.util.ArrayList;

public class SklepKomputerowy {
    public Produkt[] produkty = new Produkt[10];
    public Klient[] klienci =  new Klient[10];
    public Zamowienie[] zamowienia = new Zamowienie[10];
    public int liczbaProduktow = 0;
    public int liczbaKlientow = 0;
    public int liczbaZamowien = 0;

    public void dodajProdukt(Produkt produkt){
        if(liczbaProduktow<produkty.length)
            produkty[liczbaProduktow++] = produkt;
    }

    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
        }
    }
    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkt, int[] ilosc){
        Zamowienie noweZamowienie = new Zamowienie(liczbaZamowien+1, klient, produkt, ilosc, "10.06.2025", "Nowe");
        zamowienia[liczbaZamowien] = noweZamowienie;
        return zamowienia[liczbaZamowien++];
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] produkty = zamowienie.getProdukt();
        int[] ilosci = zamowienie.getIlosc();
        for (int i = 0; i < produkty.length; i++) {
            int aktualnyStan = produkty[i].getIloscWMagazynie();
            produkty[i].setIloscWMagazynie(aktualnyStan - ilosci[i]);
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for(int i = 0; i<liczbaZamowien; i++){
            if(zamowienia[i].getId() == idZamowienia){
                zamowienia[i].setStatus(nowyStatus);
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria){
        for(int i = 0; i<liczbaProduktow; i++){
            if (produkty[i].getKategoria().equals(kategoria)) {
                System.out.println(produkty[i].getNazwa() + ", Id:" + produkty[i].getId()+ "," + produkty[i].getCena() + "zł, ilość w magazynie:" + produkty[i].getIloscWMagazynie());
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta){
        for(int i = 0; i<liczbaZamowien; i++){
            if(zamowienia[i].getKlient().getId() == idKlienta){
                zamowienia[i].wyswietlSzczegóły();
            }
        }
    }
}

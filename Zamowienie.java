import java.util.ArrayList;

public class Zamowienie {
    private int id; //identyfikator zamowienia
    private Klient klient;
    private Produkt[] produkt;
    private int[] ilosc; // tablica ilosci odpowiadajacych produktom
    private String dataZamowienia;
    private String status; //Status zamowienia

    public Zamowienie(int id, Klient klient, Produkt[] produkt, int[] ilosc, String dataZamowienia, String status) {
        this.id = id;
        this.klient = klient;
        this.produkt = produkt;
        this.ilosc = ilosc;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }

    public double obliczWartoscZamowienia() {
        double suma = 0.0;
        for (int i = 0; i < produkt.length; i++) {
            suma += produkt[i].getCena() * ilosc[i];
        }
        return suma;
    }

    public void zastosujZnizke() {
        obliczWartoscZamowienia();
        if (klient.isCzyStaly()) {
            double cenaPoZnizce = obliczWartoscZamowienia() * 0.9;
        }
    }

    public void wyswietlSzczegóły() {
        klient.wyswietlInformacje();
        for (int i = 0; i < produkt.length; i++) {
            produkt[i].wyswietlInformacje();
        }
        System.out.println("Data zamówienia: " + dataZamowienia);
        System.out.println("Status zamówienia: " + status);
        System.out.println("Wartość całego Zamówienia: " + obliczWartoscZamowienia());
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produkt[] getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt[] produkt) {
        this.produkt = produkt;
    }

    public int[] getIlosc() {
        return ilosc;
    }

    public void setIlosc(int[] ilosc) {
        this.ilosc = ilosc;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


import java.util.ArrayList;

public class Zamowienie {
    private int id; //identyfikator zamowienia
    private Klient klient;
    private Produkt[] produkt;
    private int[] ilosc; // tablica ilosci odpowiadajacych produktom
    private String dataZamwienia;
    private String status; //Status zamowienia

    public double obliczWartoscZamowienia(){
        double suma = 0;
        for (int i = 0; i < produkt.length; i++) {
            suma += produkt[i].getCena()*ilosc[i];
        }
        return suma;
    }
    public void zastosujZnizke(){
        obliczWartoscZamowienia();
        if (getKlient().isCzyStaly()){
            double cenaPoZnizce = obliczWartoscZamowienia()*0.9;
        }
    }

    public void wyswietlSzczegóły(){
        getKlient().wyswietlInformacje();
        for (int i = 0; i < produkt.length; i++) {
            getProdukt()[i].wyswietlInformacje();
        }
        System.out.println("Data zamówienia: " + dataZamwienia);
        System.out.println("Status zamówienia: " + status);
        System.out.println("Wartość całego Zamówienia: " + obliczWartoscZamowienia());
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataZamwienia() {
        return dataZamwienia;
    }

    public void setDataZamwienia(String dataZamwienia) {
        this.dataZamwienia = dataZamwienia;
    }

    public int[] getIlosc() {
        return ilosc;
    }

    public void setIlosc(int[] ilosci) {
        this.ilosc = ilosci;
    }

    public Produkt[] getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt[] produkt) {
        this.produkt = produkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


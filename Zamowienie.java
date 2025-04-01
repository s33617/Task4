public class Zamowienie {
    private int id; //identyfikator zamowienia
    private Klient klient;
    private Produkt[] produkt;
    private int[] ilosci; // tablica ilosci odpowiadajacych produktom
    private String dataZamwienia;
    private String status; //Status zamowienia

    public String obliczWartośćZamowienia(){
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

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public Produkt[] getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt[] produkt) {
        this.produkt = produkt;
    }
}


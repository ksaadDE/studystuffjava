package app.abstrakt;


// Implementierung Abb 60 "Deklaration von Variablen des Typs einer abstrakten Klasse" unter "Abstrakte Klassen" - "Wichtige oo Konzepte"
public class AbstraktBuch extends AbstrakterArtikel {
    protected String titel;
    protected String autor; 

    public String getTwitterBeschreibung() {
        return "Buch " +  titel + "  von " + autor;
    }

}
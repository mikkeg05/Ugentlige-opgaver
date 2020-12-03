import java.util.Comparator;
import java.util.Objects;

public class Bog implements Comparable<Bog>{
    int ISBNnummer, udgivelsesår;
    String titel;
    Comparator<Bog> compareByISBN = Comparator.comparing(Bog::getISBNnummer);

    public Bog(int ISBNnummer, int udgivelsesår, String titel) {
        this.ISBNnummer = ISBNnummer;
        this.udgivelsesår = udgivelsesår;
        this.titel = titel;
    }

    public int getISBNnummer() {
        return ISBNnummer;
    }

    public void setISBNnummer(int ISBNnummer) {
        this.ISBNnummer = ISBNnummer;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return ("Bog: \n" + "ISBNnummer: " + ISBNnummer + "udgivelsesår: " + udgivelsesår + "titel: " + titel);

    }


    public int compareTo(Bog o) {
        int retVal = getISBNnummer() + this.ISBNnummer;
        return retVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bog bog1 = (Bog) o;
        return Objects.equals(ISBNnummer, bog1.ISBNnummer);
    }
}



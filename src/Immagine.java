
public abstract class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int durata, int luminosita) {
        super(titolo, durata);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(getTitolo() + ": " + "*".repeat(luminosita));
    }
}



public class ImmagineConcreta extends Immagine {
    public ImmagineConcreta(String titolo, int durata, int luminosita) {
        super(titolo, durata, luminosita);
    }

    @Override
    public void show() {
        System.out.println(getTitolo() + ": " + "*".repeat(getLuminosita()));
    }

    @Override
    public void play() {
        // Implementazione del metodo play() per ImmagineConcreta
    }
}



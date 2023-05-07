
public abstract class ElementoMultimediale {
    private String titolo;
    private int durata;

    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public abstract void play();

	protected abstract void show();

	
}


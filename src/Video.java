
public class Video extends ElementoMultimediale {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String punti = ripetiCarattere('!', volume);
            String asterischi = ripetiCarattere('*', luminosita);
            System.out.println(getTitolo() + " " + punti + " " + asterischi);
        }
    }

    private String ripetiCarattere(char carattere, int lunghezza) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lunghezza; i++) {
            sb.append(carattere);
        }
        return sb.toString();
    }

	@Override
	protected void show() {
		// TODO Auto-generated method stub
		
	}
}


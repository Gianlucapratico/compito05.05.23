
public class RegistrazioneAudio extends ElementoMultimediale {
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String sequenzaPunti = "!".repeat(volume);
            System.out.println(getTitolo() + " " + sequenzaPunti);
        }
    }

	@Override
	protected void show() {
		
		
	}
}
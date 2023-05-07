
public class MainElementoMultimediale {
    public static void main(String[] args) {
        ElementoMultimediale immagine = new ImmagineConcreta("Immagine1", 10, 5);
        ElementoMultimediale video = new Video("Video1", 20, 5, 3);
        ElementoMultimediale registrazioneAudio = new RegistrazioneAudio("Audio1", 10, 5);

        if (immagine instanceof ImmagineConcreta) {
            ((ImmagineConcreta) immagine).show();
        } else {
            immagine.play();
        }

        if (video instanceof Video) {
            ((Video) video).play();
        } else {
            video.show();
        }

        if (registrazioneAudio instanceof RegistrazioneAudio) {
            ((RegistrazioneAudio) registrazioneAudio).play();
        } else {
            registrazioneAudio.show();
        }
    }
}



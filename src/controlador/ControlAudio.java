package controlador;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ControlAudio {
    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                try {
                    URL audio = this.getClass().getClassLoader().getResource("sounds/" + url + ".wav");
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(audio);
                    Clip clip = AudioSystem.getClip();
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}

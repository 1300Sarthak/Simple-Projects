import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import java.io.File;

public class HowAreYou {
    public static void main(String[] args) {

        Scanner lmaoScanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String input = lmaoScanner.nextLine();
        System.out.println("hello " + input);

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Are you feeling good today or bad (say true for good, say false for bad) ");

        Boolean todayinput = newScanner.nextBoolean();

        if (todayinput.equals(false)) {
            System.out.println("Sorry to hear that, Hopefully this song helps you out");

            String filepath = "Gucci.wav";
            File musicpath = new File(filepath);

            try {
                if (musicpath.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();

                    JOptionPane.showMessageDialog(null, "press OK to stop playing");
                    clip.stop();

                } else {
                    System.out.println("sorry I can't find the file!");
                }

            } catch (Exception e) {
                System.out.println("Error" + e);
            }

        } else { // in Java, else cannot have a condition
            System.out.print("Thats good to hear " + input + "!");
            System.out.println(" Here is a song to celebrate!");

            String filepathlol = "Happy.wav";
            File musicpathlol = new File(filepathlol);

            try {
                if (musicpathlol.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpathlol);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();

                    JOptionPane.showMessageDialog(null, "press OK to stop playing");
                    clip.stop();

                } else {
                    System.out.println("sorry I can't find the file!");
                }
            } catch (Exception f) {
                System.out.println("Error" + f);
            }

        }

        lmaoScanner.close();
        newScanner.close();

    }
}
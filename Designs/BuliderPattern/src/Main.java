public class Main {
    public static void main(String [] args) {
        System.out.println("Builder pattern");
        Music song = new Music.MusicBuilder().addDrums().addPiano().build();
        System.out.println(song.toString());
    }
}

public class Music {
    private final boolean guitar;
    private final boolean drums;
    private final boolean piano;
    private Music(MusicBuilder builder) {
        this.guitar = builder.guitar;
        this.drums  = builder.drums;
        this.piano  = builder.piano;

    }
    public String toString() {
        return  "Guitar : " + guitar + ", Drums : " + drums + ", Piano : " + piano;
    }
    static class MusicBuilder {
        private boolean guitar;
        private boolean drums;
        private boolean piano;

        Music build () {
            return new Music(this);
        }
        MusicBuilder addDrums() {
            this.drums = true;
            return this;
        }
        MusicBuilder addPiano() {
            this.piano = true;
            return this;
        }
        MusicBuilder addGuitar() {
            this.guitar = true;
            return this;
        }
    }
}

import com.sun.speech.freetts.*;

class VoiceAssistant {

    private static Voice voice;

    static {
        System.setProperty(
            "freetts.voices",
            "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory"
        );

        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");

        if (voice != null) {
            voice.allocate();
            voice.setRate(140);
            voice.setPitch(110);
            voice.setVolume(2);
        }
    }

    public static void speak(String text) {
        if (voice != null) {
            voice.speak(text);
        }
    }
}

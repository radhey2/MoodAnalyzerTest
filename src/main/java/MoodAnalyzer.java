public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message.contains("Sad")) {
            System.out.println(message);
            return "SAD";
        } else {
            return "HAPPY";
        }

    }
}


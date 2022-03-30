public class MoodAnalyzer {
    String message;

    public String analyseMood(String message) {

        if (message.contains("Sad")) {
            System.out.println(message);
            return "SAD";
        } else {
            return "HAPPY";
        }

    }
}


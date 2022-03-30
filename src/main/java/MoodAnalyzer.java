public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {

            if (message.contains("Sad")) {
                System.out.println(message);
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            System.out.println(e);
            return "Happy";

        }
    }
}


public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("Sad")) {
                System.out.println(message);
                return "SAD";
            } else {
                return "HAPPY";
            }


        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Entered Invalid mood");

        }

    }
}


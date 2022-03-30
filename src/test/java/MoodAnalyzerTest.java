import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("this is a Sad Message");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is a Happy Message");
        String mood1 = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY",mood1);
        System.out.println(mood1);
    }
    @Test
    public void givenMessage_whenNull_ShouldReturnNull(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood2 = moodAnalyzer.analyseMood();
        Assertions.assertEquals("Happy",mood2);
        System.out.println(mood2);
    }
    @Test
    public void givenMessage_whenNull_ShouldThrowMoodAnalysisException() throws MoodAnalysisException {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            String mood3 = moodAnalyzer.analyseMood();
            Assertions.assertEquals("SAD",mood3);
            System.out.println(mood3);
        }
        catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("this is a Sad Message");
        Assertions.assertEquals("SAD", mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood1 = moodAnalyzer.analyseMood("this is a Happy Message");
        Assertions.assertEquals("HAPPY",mood1);
        System.out.println(mood1);
    }

}

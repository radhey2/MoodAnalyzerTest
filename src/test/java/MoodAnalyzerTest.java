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
}

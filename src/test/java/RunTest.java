import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Owner on 24/06/2015.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = ("html:target/cucumber")
)

public class RunTest {
}

import net.doughughes.testifier.annotation.Testifier;
import net.doughughes.testifier.output.OutputStreamInterceptor;
import net.doughughes.testifier.watcher.NotifyingWatcher;
import net.doughughes.testifier.watcher.OutputWatcher;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIn.isIn;

@Testifier(sourcePath = "./src/main/java/Example.java", clazz = Example.class)
public class ExampleTest {

    @Rule
    public NotifyingWatcher notifyingWatcher = new NotifyingWatcher("http://testifier.doughughes.net/notify");

    @Rule
    public OutputWatcher outputWatcher = new OutputWatcher();

    /**
     * The addNumbers() method should already exist and be working correctly.
     */
    @Test
    @Testifier(method = "addNumbers", args = {double.class, double.class})
    public void shouldAddTwoNumbers() throws Exception {
        /* Arrange */
        Example example = new Example();

        /* Act */
        double result = example.addNumbers(123.456, 654.321);

        /* Assert */
        assertThat(result, is(777.777));
    }

    /**
     * The student needs to add the missing semicolon.
     */
    @Test
    @Testifier(method = "sayHello", args = {})
    public void shouldHaveFixedMissingSemicolon() throws Exception {
        /* Arrange */
        Example example = new Example();

        /* Act */
        example.sayHello();

        /* Assert */
        OutputStreamInterceptor out = (OutputStreamInterceptor) System.out;
        assertThat(out.getPrinted().get(0), is("Hello, world!"));
    }

    /**
     * The student needs to add the missing curly brace.
     */
    @Test
    @Testifier(method = "getRandomColor", args = {})
    public void shouldHaveFixedMissingCurlyBrace() throws Exception {
        /* Arrange */
        Example example = new Example();

        /* Act */
        String randomColor = example.getRandomColor();

        /* Assert */
        assertThat(randomColor, isIn(Arrays.asList(new String[]{"red", "orange", "yellow", "green", "blue", "indigo", "violet"})));
    }
}
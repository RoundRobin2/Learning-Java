/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package extend_thread;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExtendThreadTest {
    @Test public void testAppHasAGreeting() {
        NewThread classUnderTest = new NewThread();
        assertNotNull("app should have a greeting", classUnderTest);
    }
}

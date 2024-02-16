package wrapper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.noesis.wrapper.Actions;
import org.noesis.wrapper.Context;
import org.noesis.wrapper.Wrapper;

public class BaseTests {
    private static Wrapper wrapper;
    protected Actions actions;
    protected Context context;

    // PROJECT SCOPE
    protected FacebookPage facebookPage;
    @BeforeAll
    public static void beforeAll() {
        wrapper = new Wrapper(true, 0);
    }

    @AfterAll
    public static void afterAll() {
        wrapper.close();
    }

    @BeforeEach
    public void beforeEach() {
        actions = new Actions(wrapper);
        context = new Context();

        // PROJECT SCOPE
        facebookPage = new FacebookPage(actions);
    }

    @AfterEach
    public void afterEach() {
        actions.close();
    }
}

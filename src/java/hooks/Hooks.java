package hooks;

import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void testBefore() {
        System.out.printf("BEFORE");
    }
}

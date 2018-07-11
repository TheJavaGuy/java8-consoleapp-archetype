package ${package};

#if (${useAssertj} == 'true' || ${useAssertj} == 'yes' || ${useAssertj} == 'y')
import static org.assertj.core.api.Assertions.assertThat;
#elseif (${useHamcrest} == 'true' || ${useHamcrest} == 'yes' || ${useHamcrest} == 'y')
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
#else
import static org.junit.Assert.assertTrue;
#end

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public final class AppTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

#if (${useAssertj} == 'true' || ${useAssertj} == 'yes' || ${useAssertj} == 'y')
    @Test
    public void test() {
        assertThat(true).isEqualTo(true);
    }
#elseif (${useHamcrest} == 'true' || ${useHamcrest} == 'yes' || ${useHamcrest} == 'y')
    @Test
    public void test() {
        assertThat(true, is(true));
    }
#else
    @Test
    public void test() {
        assertTrue(true);
    }
#end
}

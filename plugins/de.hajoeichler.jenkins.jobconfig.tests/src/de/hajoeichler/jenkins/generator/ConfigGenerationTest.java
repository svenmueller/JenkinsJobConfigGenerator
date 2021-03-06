package de.hajoeichler.jenkins.generator;

import org.junit.Test;

public class ConfigGenerationTest extends AbstractGeneratorTest {

    @Test
    public void testEmptyJobConfig() throws Exception {
        assertSingleConfig("emptyJob", "foo");
    }

    @Test
    public void testMultiLineShell() throws Exception {
        assertSingleConfig("multiLineShell", "multiLineShell");
    }

    @Test
    public void overridingOfWrapper() throws Exception {
        assertSingleConfig("overriddenTimeout", "test-overriddenTimeout");
    }

    @Test
    public void hipChat() throws Exception {
        assertSingleConfig("hipchat", "JobWithHipChat");
    }

    @Test
    public void jobWithDisplayName() throws Exception {
        assertSingleConfig("displayName", "JobWithDisplayName");
    }

    @Test
    public void jobWithCheckstyleViolations() throws Exception {
        assertSingleConfig("violations", "JobWithViolations");
    }

    @Test
    public void jobWithPredefinedPropertyOnTriggeredBuild() throws Exception {
        assertSingleConfig("predefinedPropertyOnTriggeredBuild", "JobWithPredefinedPropsOnTriggeredBuild");
    }

    @Test
    public void paramChoice() throws Exception {
        assertSingleConfig("paramChoice", "pleaseChoose");
    }

}

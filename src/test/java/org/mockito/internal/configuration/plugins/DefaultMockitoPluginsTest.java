package org.mockito.internal.configuration.plugins;

import org.junit.Test;
import org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker;
import org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker;
import org.mockito.plugins.MockMaker;
import org.mockitoutil.TestBase;

import static org.junit.Assert.*;
import static org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.INLINE_ALIAS;

public class DefaultMockitoPluginsTest extends TestBase {

    private DefaultMockitoPlugins plugins = new DefaultMockitoPlugins();

    @Test
    public void provides_plugins() throws Exception {
        assertEquals("org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker",
            plugins.getDefaultPluginClass(INLINE_ALIAS));
        assertEquals(InlineByteBuddyMockMaker.class, plugins.getInlineMockMaker().getClass());
        assertEquals(ByteBuddyMockMaker.class, plugins.getDefaultPlugin(MockMaker.class).getClass());
    }
}
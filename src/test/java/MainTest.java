import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

import se.ciserver.TestUtils;
import se.ciserver.ContinuousIntegrationServer;
import se.ciserver.TestRunner;
import se.ciserver.github.PushParser;
import se.ciserver.github.Push;
import se.ciserver.github.InvalidPayloadException;

/**
 * Test class
 */
public class MainTest
{


   /**
     * Tests that at least one test failssasduisdi
     */
    @Test
    public void simpleTest() {
        int sum = 1+1;
        assertTrue(sum==22);
    }

    @Test
    public void simpleTest2() {
        int sum = 1+1;
        assertTrue(sum==3);
    }


}
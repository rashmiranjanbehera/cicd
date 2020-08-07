package testng;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class CicdSampleTest
{

    CicdSample cicdSample = new CicdSample();
    String url = "www.indianeagle.com/";
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sampleTest1()
    {
        cicdSample.launch(url);
        assertTrue( true );
    }

    @Test
    public void sampleTest2()
    {
        cicdSample.launch(url);
        assertTrue( true );
    }

    @Test
    public void sampleTest3()
    {
        cicdSample.launch(url);
        assertTrue( true );
    }


}

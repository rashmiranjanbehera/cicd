package com.indianeagle.impl;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

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
    public void sampleTest1() throws MalformedURLException {
        cicdSample.launchCrome(url);
        assertTrue( true );
    }

    @Test
    public void sampleTest2() throws MalformedURLException
    {
        cicdSample.launchFirefox(url);
        assertTrue( true );
    }

    @Test
    public void sampleTest3() throws MalformedURLException
    {
        cicdSample.launchCrome(url);
        assertTrue( true );
    }


}

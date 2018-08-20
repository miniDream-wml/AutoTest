package myg.mya;

import java.io.UnsupportedEncodingException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	@BeforeClass
	public void setUp() throws UnsupportedEncodingException {
		System.out.println("接口测试开始！");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("接口测试结束！");
	}
	@Test
    public void App()
    {
        System.out.println( "Hello World!" );
    }
}

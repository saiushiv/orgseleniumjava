import managers.DriverActionManager;
import managers.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.File;

/**
 * This is the Base Test class that contains methods common to all the steps
 */
public class BaseTest {

    @BeforeClass
    public static void setUp(){
        String classPath = System.getProperty("java.class.path");
        String pathEntries[] = classPath.split(File.pathSeparator);
        String driverPath = "";
        for(String s: pathEntries){
            if(s.contains("target\\classes")){
                driverPath = s;
            }
        }
        WebDriverManager.startDriver("chrome",driverPath + "\\chromedriver.exe");
    }

    @AfterClass
    public static void stopTest(){
        DriverActionManager.quit();
    }
}

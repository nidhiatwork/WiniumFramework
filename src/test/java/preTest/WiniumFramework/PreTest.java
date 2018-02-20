package preTest.WiniumFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class PreTest {

	 public static void main( String[] args ) throws MalformedURLException
	    {
		   System.out.println("HEY!!!!");
	       DesktopOptions option = new DesktopOptions();
	       option.setApplicationPath("C:\\Program Files\\Adobe\\Adobe Premiere Elements 2018\\PremiereElementsEditor.exe");
	       WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
	       
	    
	    
	    }
}

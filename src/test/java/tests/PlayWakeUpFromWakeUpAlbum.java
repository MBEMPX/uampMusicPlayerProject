package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class PlayWakeUpFromWakeUpAlbum extends BaseClass {

	@Test
	public void playWakeUpSong() {
		
		System.out.println("Waiting for Browser to load");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Albums']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Wake Up']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Wake Up\"));");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Wake Up']").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
}

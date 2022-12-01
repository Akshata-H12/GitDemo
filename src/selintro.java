import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Documents\\geckodriver.exe");
		WebDriver Driver= new FirefoxDriver() ;
		Driver.get("https://www.google.com/search?q=flower&client=firefox-b-d&tbm=isch&source=iu&ictx=1&vet=1&fir=kynP2p55eMS7TM%252CMqJ0o7Xjxwc15M%252C_%253BGGrA_FqXnfse-M%252CZih9vqAzJOmeTM%252C_%253BgJbbUW13zaD6EM%252CZih9vqAzJOmeTM%252C_%253BqeZb3aoRn6vGgM%252CoJbP5y_-ek47wM%252C_%253BeDfVZl4nUpqg7M%252CW3pWr6uACHGvJM%252C_%253BGe0sPl2wtwPeYM%252C6ZeVwdp2vU8abM%252C_%253BQgULphig4xWzFM%252CUp2fFq51CPhqBM%252C_%253BV0PEfdCjSWAL_M%252CTE6or1FVU4DnNM%252C_%253BdUBTOFcqZwYXVM%252CCOHH8Hxon84ttM%252C_%253BDLvqNfZoSxNa9M%252CHOqXEvxEUfInTM%252C_%253BrwqXxYAWHAml0M%252CKHb_DrQoiHHqIM%252C_%253BVlbmyFjsH6D20M%252CMqJ0o7Xjxwc15M%252C_%253BtWvaRYvHfiebzM%252Cx0pv5LiNmxeKNM%252C_%253BRfUQ_0SdSVxZyM%252CV4JMFD_QVN1xmM%252C_&usg=AI4_-kQgH59ENIXhchN4yBbRmU_sb8fZzA&sa=X&ved=2ahUKEwjosavBjYX5AhVc1jgGHYS2BLIQ9QF6BAgPEAE#imgrc=gJbbUW13zaD6EM");
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		Driver.close();

	}

}

package oops;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedException {

	public static  void main(String[] args) throws FileNotFoundException,Interrupt  {
		FileInputsStream f = new FileInputsStream("D:\\21anj\\Coursera\\Galaxy wallpaper.jpg");
		System.out.println("STARTED");
		Thread.sleep(5000);
		System.out.println("STOPPED");
	}
}



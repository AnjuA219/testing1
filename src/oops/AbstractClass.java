package oops;
abstract class Google
{
	abstract void search();
	public void message()
	{
		System.out.println("thank you for using google");
		
	}
}
class SearchAll extends Google
{

	@Override
	void search() {
		System.out.println("search detals");
		
	}
}
class SearchImage extends Google
{

	@Override
	void search() {
		System.out.println("image search details");
		
	}	
}
class SearchVideo extends Google
{

	@Override
	void search() {
		System.out.println("video search details");
		
	}
	
}


public class AbstractClass{
	public static void main(String[] args)
	{
		SearchAll a = new SearchAll();
		
				a.search();
				a.message();
				
				SearchImage i = new SearchImage();
				i.search();
				i.message();
				
				SearchVideo v = new SearchVideo();
				v.search();
				v.message();
	}


	
}
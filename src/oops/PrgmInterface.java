package oops;
interface whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
	
}
	class Audiocalls implements whatsappcalls{
	@Override
	public void calls() {
		System.out.println("Calls");
		
	}

	@Override
	public void mute() {
		System.out.println("mute");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}
	class Videocalls implements whatsappcalls{

		@Override
		public void calls() {
			System.out.println("calls");
			
		}

		@Override
		public void mute() {
			System.out.println(("mute"));
			
		}

		@Override
		public void disconnect() {
			System.out.println("disconnect");
			
		}
		
		
		
	}
public class PrgmInterface {
	public static void main(String[] args)
	{
		Audiocalls a = new Audiocalls();
		a.calls();
		a.mute();
		a.disconnect();
		
		Videocalls v = new Videocalls();
		v.calls();
		v.mute();
		v.disconnect();
		
		whatsappcalls ob = new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		
		ob= new Videocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		}
}



	
}

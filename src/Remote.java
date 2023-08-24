interface tvremote
{
public void volumeup();
public void volumedown();
public void channelup();
public void channeldown();
}
interface smarttvremote extends tvremote
{
	public void bluetooth();
	public void netflix();
}
class tv implements smarttvremote
{

	@Override
	public void volumeup() {
		System.out.println("tvvolumeup");
		
	}

	@Override
	public void volumedown() {
		System.out.println("tvvolumedown");
		
	}

	@Override
	public void channelup() {
		System.out.println("tvchannelup");
		
	}

	@Override
	public void channeldown() {
		System.out.println("tvchanneldown");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("tvbluetooth");
		
	}

	@Override
	public void netflix() {
		System.out.println("tvnetflix");
		
	}
}
public class Remote {

	public static void main(String[] args) {
		tv t1=new tv();
		t1.volumeup();
		t1.volumedown();
		t1.channelup();
		t1.channeldown();
		t1.bluetooth();
		t1.netflix();
		

	}

}

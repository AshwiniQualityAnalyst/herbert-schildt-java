package PackagesAndInterfaces;

interface Modem 
{
	public boolean open();
	public boolean close();
	public int read();
	public int write(byte[] buffer);
}

class MindStickModem implements Modem
{
	@Override
	public boolean open() 
	{
		return true;
	}
	@Override
	public boolean close() 
	{
		return true;
	}
	@Override
	public int read() 
	{
		return 0;
	}
	@Override
	public int write(byte[] buffer) 
	{
		return 0;
	}
}

class HuaweiModem implements Modem
{

	@Override
	public boolean open() 
	{
		return true;
	}
	@Override
	public boolean close() 
	{
		return true;
	}
	@Override
	public int read() 
	{
		return 0;
	}
	@Override
	public int write(byte[] buffer) 
	{
		return 0;
	}

}
class CheckInterface 
{
	public static void main(String[] args) 
	{
		Modem modem = new MindStickModem();
		modem.open();
		modem.write(null);
		modem.read();
		modem.close();

		//Now, to interface our application with Huawei modem, we would use the following code:
		Modem modem1 = new HuaweiModem();
		modem1.open();
		modem1.write(null);
		modem1.read();
		modem1.close();
	}
}
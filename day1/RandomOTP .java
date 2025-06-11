package Day2;

import java.util.Random;

public class RandomOTP {
	public static int oTP()
	{
		Random ran =new Random();
		return 1000 + ran.nextInt(9000);
	}

}

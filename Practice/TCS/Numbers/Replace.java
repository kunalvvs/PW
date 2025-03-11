package Practice.TCS.Numbers;
// Java program for the above approach
import java.io.*;

class Replace {
static int reverseTheNumber(int temp)
{
	int ans = 0;
	while (temp > 0) {
		int rem = temp % 10;
		ans = ans * 10 + rem;
		temp = temp / 10;
	}
	return ans;
}

static int convert0To5(int num)
{
	if (num == 0)
		return 5;
	else {
		int temp = 0;

		while (num > 0) {
			int digit = num % 10;

			if (digit == 0)
				digit = 5;

			temp = temp * 10 + digit;
			num = num / 10;
		}

		return reverseTheNumber(temp);
	}
}

	public static void main(String args[])
	{
		int num = 10120;
        System.out.println("।।।।।।।।।।।।।।।।।।।⫴⫴⫴⫴⫴⫴⫴⫴।।।।।→→→→→→→→");
        System.out.println("Original Number : "+num);
		System.out.println("Replace Number: "+ convert0To5(num));
	}
}

 

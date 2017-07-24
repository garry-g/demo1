import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Test;

public class Demo1 {

	public static int a;
	public int b;
	public Demo1(){
		a++;
		b++;
		System.out.println("a:"+a+",b:"+b);
	}
	public static void main(String[] args) {
		for(int x=0;x<10;x++){
			Demo1 d= new Demo1();
		}
	}
}

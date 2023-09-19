package k20230407;

import java.util.Arrays;

public class ArrayTestEx
{
	public static void main(String[] args)
	{
		String[] data = new String[5];
		System.out.println(Arrays.toString(data));
		
		String name[] = {"홍길동","임꺽정","장발산","일지매","손오공","저팔계","사오정"};
		System.out.println(Arrays.toString(name));
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		for(String str : name)
		{
			System.out.println(str);
		}
		
	}
}

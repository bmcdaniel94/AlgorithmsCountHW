package inversionspackage;

import java.util.ArrayList;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		
		ArrayList<Integer> source = new ArrayList<Integer>();
		
		Random r = new Random();
		
		int inversion = 0;
		
		source.add(r.nextInt(50));
		source.add(r.nextInt(50));
		source.add(r.nextInt(50));
		source.add(r.nextInt(50));
		source.add(r.nextInt(50));
	
		System.out.println(source);
		for(int i = 0; i < source.size(); i++)
		{
			for(int j = 0; j < source.size(); j++)
			{
				if(i < j && source.get(i) > source.get(j))
				{
					inversion++;
				}
			}
		}
		
		System.out.println(inversion);
		
		inversion = new InsertionSort(source);

	}

}

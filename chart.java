public class chart {
	public static int i;
	public static int h;
	public static int numSteps;
	public static void main(String args[]){
		i = 23;
		numSteps = 1;
		System.out.println("starting number : " + i);
		for (;i != 1;){
			if (i % 2 == 0){
				i /= 2;
			}
			else{
				i *= 3;
				i += 1;
			}
			h = i;
			for (;h != 0;){
				System.out.print("_");
				//also looks cool as "_-"
				h -= 1;
			}
			System.out.println();
			numSteps += 1;
		}
		System.out.println("Steps Taken : " + numSteps);
	}
}

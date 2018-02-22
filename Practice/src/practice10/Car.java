package practice10;

public class Car {
		int serialNo;
		String color;
		int gasoline;

		public int run(){

			if(gasoline<=0) {
				return -1;
			}
			gasoline = gasoline-1;

			int random ;

			random = new java.util.Random().nextInt(15);

			return random+1;
		}
}

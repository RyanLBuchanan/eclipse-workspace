package control_flow;

public class Loops {

	public static void main(String[] args) {

		int counter = 0;
		
		for (int idx = 0; idx < 100; idx++) {
//			System.out.println("idx: " + idx);

			for (int j = 0; j < 100; j++) {
				System.out.println("The value of idx was: " + idx + " and j: " + j);
				counter++;
			}
		}
		
		System.out.println("Counter: " + counter);

//		int counter = 0;
//		
//		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
//			
//			int temp = counter + 1;
//			
//			counter = temp;
//		}

//		String name = "jlsfdkg;ghaklfjga;lkgj";

//		for (int i = 0; i <= 100; i+=2) {
//			System.out.println(i);
//		}
//		
//		for (int i = name.length() - 1; i >= 0; i--) {
//			System.out.println("char: " + name.charAt(i));
//		}

//		for (int i = 0; i < 100; i++) {
//			System.out.println("i: " + i);
//		}

//		String str = "We have a large inventory of Cyber Goddesses "
//				+ "the category:Chapel and the slightly hotter " 
//				+ "category:Major.";
//		
//		printCategories(str);

//		int counter = 0;
//		
//		while (counter < 30) {
//			System.out.println("Chapel is a goddess! Counter = " + counter);
//			counter++;
//			printCategories("Counter = " + counter);
//			if(counter == 30) {
//			// Terminating loop early
//			break;}
//		}
	}

//	public static void printCategories(String string) {
//		int i = 0;
//		while (true) {
//			int found = string.indexOf("category:", i);
//			
//			if (found == -1) {
//                break;
//            }
//
//            int start = found + 9; // Start of actual category:
//            int end = string.indexOf(" ", start); // End of actual category:
//            System.out.println(string.substring(start, end));
//            i = end + 1;
//		}
//	}
}

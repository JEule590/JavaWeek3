
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Working with Arrays  using 3 student variables
//		String studentName1 = "Tom Sawyer";
//		String studentName2 = "Jack Smith";
//		String studentName3 = "Bill Turner";
//		
//		System.out.println(studentName1);
//		System.out.println(studentName2);
//		System.out.println(studentName3);
//		
//		//How the array works
//		String[]students = new String[3];
//		
//		students[0] ="Tom Sawyer";
//		students[1] = "Jack Smith";
//		students[2] = "Bill Turner";
//		
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
//		
//		// adding a for loop
//		for  (int i = 0; i<3; i++) {
//			
//			System.out.println(students[i]);
//		}	
//	// Now using an ENHANCED for loop
//			System.out.println("Enhanced for loop:"); // Used to identify in the Console, not part of the code.
//			
//			for (String student : students) {
//				System.out.println(student);
//			}
//			
			// Video 2 More Arrays
       String[] products = new String[5]; // part 1
       
		products[0] = "carrots";          //part 2
		products[1] = "pinaple";
		products[2] = "Tomatoes";
		products[3] = "Potatos";
		products[4] = "cereal";
		
		for(String product : products) {             //Enhanced for loop
			System.out.println("product: " + product);
		}
//		int[] multiplesOf3 = new int[10];
//		for(int i = 1; i <= multiplesOf3.length; i++) {    //Standard for loop
//			multiplesOf3[i - 1] = i * 3;
//			System.out.println("number: " + multiplesOf3[i - 1]);
			
			int[] multiplesOf5 = new int[10];
			for(int i = 0; i< multiplesOf5.length; i++) {
				multiplesOf5[i] = (i + 1) * 5;
				System.out.println(multiplesOf5[i]);
			}
		}
		
	}




import java.util.* ;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter you name : ");
		String name = sc.nextLine();
		System.out.print("Entered age is : ");
		System.out.println(age);
		System.out.print("According to your entered age , you are ");
		if (age >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Not Adult");
		}
		
		
	}
}

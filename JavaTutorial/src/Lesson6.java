
public class Lesson6 {
	public static void main(String[] args) {
		String str1 = "aples are my favorite fruit";
		String str2 = "apricort are delicious";
		String str3 = "apricort are delicioussss";

		System.out.println(str1);
		System.out.println(str2);
		if (str1.compareTo(str2) > 0)
			System.out.println("Str1 comes after Str2");
		if (str1.compareTo(str2) < 0)
			System.out.println("Str1 comes before Str2");
		if (str1.compareTo(str2) == 0)
			System.out.println("Str1 is equal to Str2");

		System.out.println();
		System.out.println(str3);
		System.out.println(str2);
		if (str3.compareTo(str2) > 0)
			System.out.println("Str3 comes after Str2");
		if (str3.compareTo(str2) < 0)
			System.out.println("Str3 comes before Str2");
		if (str3.compareTo(str2) == 0)
			System.out.println("Str3 is equal to Str2");
	}
}

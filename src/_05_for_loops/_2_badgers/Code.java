package _05_for_loops._2_badgers;

public class Code {
	public static void main(String[]args) {
		for(int l=0; l<2; l=l+1) {
			for(int b=0; b<12; b=b+1) {
				System.out.print("Badger");
				if (b<11) {
					System.out.print(", ");
				}
			}

			System.out.println();

			for(int m=0; m<2; m=m+1) {
				System.out.print("Mushroom");
				if (m<1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println("A Snake!!!");
	}
}


//public class TestaFor {
//	public static void main(String[] args) {
//		for(int contador = 0; contador <= 10; contador++) {
//			System.out.println(contador);
//		}
//	}
//}


public class TestaFor {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.println("\t");
			}
			System.out.println(" ");
		}
	}
}
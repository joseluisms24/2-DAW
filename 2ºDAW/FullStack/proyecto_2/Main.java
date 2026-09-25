public class Main {
	public static void main(String[] args) {
		int[][] tabla = new int[9][9];
		int cont = 1;
		for (int j=0; j < tabla.length; j++) {
			for (int i=0; i < tabla[j].length; i++) {
				tabla[j][i] = cont * i;
				System.out.println(tabla[j][i]);
			}
			cont++;
		}
	}
}
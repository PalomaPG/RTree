package genrect;


public class Main {

		public static void main(String[] args) {
			
			synthgenRutine();
		}
		
		public static void synthgenRutine() {
			System.err.println("INIT - Synthetic data generation");
			SynthGen sg = new SynthGen(3, "/home/paloma/Documents");
			sg.writeFile();
			System.err.println("END - Synthetic data generation");
		}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CV cv1 = new CV("Sarrazin", "William", "Coll�giale", 1, "Programmation", "Apprendre de nouvelles choses");
		
		CV cv2 = new CV("Torres", "Agustin", "Coll�giale", 2, "Prog", "Apprendre");
		
		System.out.println("Bienvenue chez Barette!\n");
		
		cv1.afficher();
		
		cv2.afficher();
		
		
	}

}

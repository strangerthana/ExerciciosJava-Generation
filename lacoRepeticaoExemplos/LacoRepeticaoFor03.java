package lacoRepeticaoExemplos;

public class LacoRepeticaoFor03 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int i = 0; //inicio
		
		for(;i <= 50;) { //condiçaõ
			
			i = i + 3; //incremento
			
			System.out.println(i);
			
			Thread.sleep(1000);
		}
	}
}

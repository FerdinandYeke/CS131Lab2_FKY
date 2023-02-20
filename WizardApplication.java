
public class WizardApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wizard wiz1 = new Wizard();
		
		wiz1.setName("John Doe");
		wiz1.setHealth(100);
		wiz1.setKey(384);
		wiz1.lock(384);
		
		System.out.println("Wizard:");
		System.out.println(""+wiz1.toString());
		
		
		wiz1.unlock(384);
		wiz1.takeDamage(20);
		
		System.out.println("");
		System.out.println("Uh oh, "+wiz1.getName()+" not"
				+" only got his protection spell key unlocked, but gotten"
				+ " hit by lightning!");
		System.out.println(""+wiz1.toString());
		
		
		

	}

}

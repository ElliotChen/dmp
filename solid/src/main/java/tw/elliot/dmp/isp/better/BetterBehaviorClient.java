package tw.elliot.dmp.isp.better;


public class BetterBehaviorClient {
	public static void main(String[] args) {
		Dog dog = new Dog();
		PetDog smallDog = new PetDog();
		dog.eat(smallDog);
		dog.flash(smallDog);
		dog.move(smallDog);

		Bird bird = new Bird();
		Dove cuteDove = new Dove();
		bird.eat(cuteDove);
		bird.fly(cuteDove);
		bird.slide(cuteDove);
	}
}

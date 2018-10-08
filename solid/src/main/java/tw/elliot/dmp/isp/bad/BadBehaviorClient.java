package tw.elliot.dmp.isp.bad;

public class BadBehaviorClient {

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

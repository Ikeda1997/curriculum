package check;
import constants.Constants;
public class check{
		private String firstName = "池田";
		private String lastName = "康太郎";

		private void printName () {
			System.out.println(this.firstName + this.lastName);

		}
		public static void main(String[] args){
			check c = new check();
			c.printName();

			Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
			pet.introduce();

			RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
			robotpet.introduce();
		}


}

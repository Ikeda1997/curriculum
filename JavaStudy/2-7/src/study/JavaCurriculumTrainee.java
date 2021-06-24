package study;

public abstract class JavaCurriculumTrainee {
	private String name;

	 /**
	 * コンストラクタ
	 * @param name
	 */
	 public JavaCurriculumTrainee(String name) {
	 this.name = name;
	 }

	 /**
	 * 抽象メソッド: Javaカリキュラムをこなす！
	 * public abstract void xxxxx();
	 */
	 public abstract void doJavaCurriculum();

	 /**
	 * @return name
	 */
	 protected String getName() {
	 return name;
	 }

	 public class Trainee extends JavaCurriculumTrainee {

		public Trainee(String name) {
			super(name);
			// TODO 自動生成されたコンストラクター・スタブ
		}

		@Override
		public void doJavaCurriculum() {
			// TODO 自動生成されたメソッド・スタブ

		}

	 }

}

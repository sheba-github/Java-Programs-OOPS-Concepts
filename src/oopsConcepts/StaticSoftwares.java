package oopsConcepts;

public class StaticSoftwares {
	public String pgmLanguage;
	private static int instanceNum = 0;

	public StaticSoftwares(String pgmLanguage) {
		this.pgmLanguage = pgmLanguage;
		instanceNum++;
	}

	public  int getInstanceCount() {
		return instanceNum;
	}

	public String getPgmLanguage() {
		return pgmLanguage;
	}

}

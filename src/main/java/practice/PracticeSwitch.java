package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		String job[] = {"勇者","バトルマスター","パラディン","海賊","魔法戦士"};

		for(int i = 0; i < 5; i++) {
			switch(i) {
			case 0:
				System.out.println(array[i] + ":" + job[0]);
				break;
			case 1:
				System.out.println(array[i] + ":" + job[1]);
				break;
			case 2:
				System.out.println(array[i] + ":" + job[2]);
				break;
			case 3:
				System.out.println(array[i] + ":" + job[3]);
				break;
			case 4:
				System.out.println(array[i] + ":" + job[4]);
			}
		}
	}

}

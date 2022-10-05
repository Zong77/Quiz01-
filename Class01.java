package Java111Q1;

import Java111Q1.Data;

class Data {
	private String name;
	private Test score;

	class Test {
		private int english;
		private int math;

		Test(int eng, int m) {
			english = eng;
			math = m;
		}

		double avg() {
			return (english + math) / 2.0;
		}
	}

	void show() {
		System.out.println("name:" + name);
		System.out.println("english:" + score.english);
		System.out.println("math:" + score.math);
		System.out.println("avg:" + score.avg());
	}

	Data(String n, int eng, int m) {
		name = n;
		score = new Test(eng, m);
	}
}
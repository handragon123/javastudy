package methodex;

public class Mymath2Test {

	public static void main(String[] args) {
		
		// Mymath2.sI = Mymath2파일에서sI를 불러옴
		System.out.println(Mymath2.sI);
		
		//Mymath2 class에서 sAdd파일을 가져와 Mymath2.si값을 넣고 y에 넣어줌
		int y = Mymath2.sAdd(Mymath2.sI);
		System.out.println(y);
		
		// instance값인 Mymath2 값을 math에넣고 math.i값을 보여줌
		Mymath2 math = new Mymath2();
		System.out.println(math.i);
		// y값에 instance변환한 math에 add함수에 값을 넣어줌
		y = math.add(math.i, Mymath2.sI);
		System.out.println(y);
	}

}

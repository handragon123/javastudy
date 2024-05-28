package interfacepkg;

public class ComouterMain {

	public static void main(String[] args) {
		// 다형성을 이용하여 인터페이스 new
		GraphicCard gpu = new Amd();
		Computer computer = new Computer(gpu);
		
		// gpu 교체
        gpu = new Nvidia();
        computer.setGpu(gpu);
	}

}

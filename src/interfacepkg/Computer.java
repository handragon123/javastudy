package interfacepkg;
// 인터페이스 다형성
public class Computer {
	GraphicCard gpu;
	//오버로딩
	public Computer(GraphicCard gpu) {
		this.gpu = gpu;
	}
	public GraphicCard getGpu() {
		return gpu;
	}
	public void setGpu(GraphicCard gpu) {
		this.gpu = gpu;
	}   
}

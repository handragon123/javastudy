package interfacepkg;
// 인터페이스 FAX기능 1. 보내기, 2. 받기
public interface Fax {
	String FAX_NUMVER = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
}

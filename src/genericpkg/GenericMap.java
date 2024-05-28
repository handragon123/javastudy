package genericpkg;

// 제네릭으로 클래스 생성 K=KEY, V=VALUE
public class GenericMap<K, V> {
	K name; // 변수 생성
	V id; // 변수 생성
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	public K getName() {
		return name;
	}
	public V getId() {
		return id;
	}
}

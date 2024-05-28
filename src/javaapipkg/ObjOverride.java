package javaapipkg;
// 값 체크를 위해서 재정의
public class ObjOverride extends Object{
	int objVar;

	public ObjOverride(int objVar) {
		this.objVar = objVar;
	}
	// 부모 object 오버라이드
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof ObjOverride) {
			ObjOverride oo = (ObjOverride)obj;
			if(this.objVar == oo.objVar) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}

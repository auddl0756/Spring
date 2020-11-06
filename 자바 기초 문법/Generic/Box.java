package basic;

//가상 클래스 E를 사용한다. ==> casting 필요없어짐.
//generic :: 데이터의 타입(data type)을 일반화한다(generalize)
//(데이터 타입을 컴파일 시에 미리 지정)
public class Box<E> {
	private E obj;
	
	public void setObj(E obj) {
		this.obj=obj;
	}
	
	public E getObj() {
		return obj;
	}
}

package basic;

//���� Ŭ���� E�� ����Ѵ�. ==> casting �ʿ������.
//generic :: �������� Ÿ��(data type)�� �Ϲ�ȭ�Ѵ�(generalize)
//(������ Ÿ���� ������ �ÿ� �̸� ����)
public class Box<E> {
	private E obj;
	
	public void setObj(E obj) {
		this.obj=obj;
	}
	
	public E getObj() {
		return obj;
	}
}

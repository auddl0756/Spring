package ObjectCreation.factoryMethod.pros2;

//2.��ü ������ ȣ���� ������ �ν��Ͻ��� �������� �ʾƵ� �ȴ�.
public class Book {
	String name;
	public static final Book INSTANCE = new Book();
	
	public Book() {
		super();
	}
	
	public static Book getInstance() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		//this makes new instance every time.
		for(int i=0;i<10;i++) {
			Book book = new Book();
		}
		
		//reuse already made instance.
		for(int i=0;i<10;i++) {
			Book book = Book.getInstance();
		}
		
	}
	
}

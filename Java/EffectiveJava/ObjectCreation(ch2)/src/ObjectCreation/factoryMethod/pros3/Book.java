package ObjectCreation.factoryMethod.pros3;
import java.util.*;

//��ü ���� �ÿ� �ڽ� Ÿ���� ��ȯ�� ���� �ִ� �������� �־ Ŭ���̾�Ʈ�� �� �� ���� ��밡���ϴ�.
//������ ���� �������̽������� ����� �� �ְ� �Ѵ�.
public class Book {
	public static final Book INSTANCE = new Book();
	public Book() {}
	
	public static Book getInstance() {
		return INSTANCE;			//���� Ÿ���� ��ȯ�� ���� �ְ�
	}
	
	public static Book getChildInstance() {
		return BookChild.getInstance();	//�ڽ� Ÿ���� ��ȯ�� ���� �ִ�
	}
	
	public static void main(String[] args) {
		//List<Integer> a = new ArrayList<>();
		//List<Integer> a2 = new LinkedList<>();
	
		Book book1 = Book.getInstance();
		Book book2 = Book.getChildInstance();
	}
}


class BookChild extends Book{
	private BookChild() {}
	
	public static BookChild getInstance() {
		return new BookChild();
	}
}
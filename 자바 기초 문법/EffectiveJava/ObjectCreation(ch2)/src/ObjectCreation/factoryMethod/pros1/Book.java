package ObjectCreation.factoryMethod.pros1;

//1. ��ü ���� �ÿ� ������ ��� ���丮 �޼��带 ���� �ǹ̸� �� ��Ȯ�� �� �� �ִٴ� ������ �ִ�...
public class Book {
	private String name;
	
	public Book(String name) {
		this.name=name;
	}
	
	public static Book withName(String name) {
		return new Book(name);
	}
	
	public static Book withAuthor(String name) {
		return new Book(name);
	}
	
	public static void main(String[] args) {
//Is Parameter "Effective Java" book name? yes in this case. but can be ambiguous
		Book book1_1 = new Book("Effective Java");
		Book book2_1 = new Book("Gosling");	//�̰� �������� å ��������..?? ������ ����� �˼��� ����.
		System.out.println(book1_1.name);
		
//this has better clarity
		Book book1_2 = Book.withName("Effective Java");
		Book book2_2 = Book.withAuthor("Gosling");
		System.out.println(book1_2.name);
	}
	
}

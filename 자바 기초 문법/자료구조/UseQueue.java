package basic;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		Queue<Integer> q = new LinkedList<>();
		
		//1. push
		q.add(Integer.parseInt(br.readLine()));	//also possible : offer()
		q.add(Integer.parseInt(br.readLine()));
		q.offer(Integer.parseInt(br.readLine()));
		
		//2.pop
		q.remove();	//also possible : poll()
		
		//3.ù��° �� ����
		System.out.println(q.peek());
		
		//4.������ �� ����
		//linked list�� ť�� �����߱� ������ 1��° �� ������ O(1)������ 
		//������ �� ������ O(n)�� �ɸ���.
		//�迭�� �ٲ㼭 ������ ���� �����غ� �� �ִ�.
		System.out.println(q.toArray()[q.size()-1]);
		
		br.close();
		bw.flush();
		bw.close();

	}

}

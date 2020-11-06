package basic;

import java.io.*;
import java.util.*;

public class UsePriorityQueue {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//min heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//max heap
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		//1.push 
		pq.add(100);
		pq.add(10);
		pq.add(1);
		pq.add(-10);
		
		//2.pop :: return head and remove head.
		bw.write(pq.remove()+"\n");
		
		//3. remove all 
		pq.clear();
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}

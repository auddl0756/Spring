package basic;

import java.io.*;
import java.util.Arrays;

public class useArray {
	public static void main(String[] args) throws IOException{
		
	//<console io>
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int n= Integer.parseInt(br.readLine());
		
		//����,�Ҵ�
		int[] a = new int[n];
		
		//�ʱ�ȭ
		Arrays.fill(a, 0);
		
		//�ʱ�ȭ 2
		for(int i=0;i<n;i++) a[i]=0;
		
		
		//�Է� : 1 2 3 4
		String[] input = br.readLine().split(" ");
		for(int i=0;i<input.length;i++)
			a[i]=Integer.parseInt(input[i]);
		
		
		//���
		for(int x:a)
			bw.write(String.valueOf(x)+" ");
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}


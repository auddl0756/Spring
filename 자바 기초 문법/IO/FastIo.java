package basic;

import java.io.*;

public class FastIo {
	public static void main(String[] args) throws IOException{
	//<file io>
		//FileReader fr = new FileReader("[file name]");
		//BufferedReader br = new BufferedReader(fr);
		
	//<console io>
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int num = Integer.parseInt(br.readLine());
		String[] input=br.readLine().split("");
		
		for(int i=0;i<input.length;i++)
			//System.out.println(input[i]);
			bw.write(input[i]);
		
		br.close();
		bw.flush();
		bw.close();
		//BufferedWriter의 경우 반드시 flush() / close() 를 호출해 닫아주어야 한다.
		
	//other : stringTokenizer도 있다.
	}
}

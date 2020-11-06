package basic;

import java.io.*;
import java.util.*;

public class UseGeneric {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Box<String> box=new Box<>();
		box.setObj("String also possible because String is child of Object type");
		bw.write(box.getObj()+"\n");
		
		Box<Integer> box2 =new Box<>();	
		box2.setObj(1);
		bw.write(box2.getObj()+"\n");
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}

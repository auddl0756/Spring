package ch2_behaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_parameterizaion {
	public static void main(String[] args) {
//		List<Integer> a= Arrays.asList(
//				7,8,1,2,6,1,2,5,3,3,0
//		);		

		//  Comparator 구현해서 정렬
//		a.sort(new Comparator<Integer>(){
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1<o2) return -1;
//				else if(o1==o2) return 0;
//				else return 1;
//			}
//		});
		
		
		//lambda expression 사용해서 정렬
//		a.sort((Integer o1,Integer o2)-> (o1<o2 ? -1:1));
		
		
		List<Info> a = Arrays.asList(
				new Info(20,30,80),
				new Info(27,70,70),
				new Info(29,80,60)
				);
		
		
//		a.sort(new Comparator<Info>() {
//			@Override
//			public int compare(Info o1, Info o2) {
//				return o1.getScore()-o2.getScore();
//			}
//		});
		
		//using lambda expression
		a.sort((Info o1,Info o2)->(o1.getScore() - o2.getScore()) );
		
		for(Info x:a) System.out.println(x);
		
		
	}
	
	
	//just sample DTO class
	static class Info{
		private int age;
		private int score;
		private int health;
		
		public Info(int age,int score,int health) {
			this.age=age;
			this.score=score;
			this.health=health;
		}
		
		public int getAge() {
			return age;
		}
		
		public int getHealth() {
			return health;
		}
		
		public int getScore() {
			return score;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setHealth(int health) {
			this.health = health;
		}
		
		public void setScore(int score) {
			this.score = score;
		}
		
		@Override
		public String toString() {
			return age+" "+score+" "+health;
		}
		
	}
}

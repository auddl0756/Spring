package ch2_behaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//filter candidates by 2 basis using "Behavior Parameterization"
// "Behavior Parameterization" : one method, 
// 			diffrent behavior by parameter(implemented method in object predicate )

public class FilterCandidates {
	public static void main(String[] args) {
		
		List<Candidate> Candidates = Arrays.asList(
			new Candidate(100,60),
			new Candidate(90,90),
			new Candidate(60,90)		
		);
		
		List<Candidate> passed1=filter(Candidates,new CandidateAlgorithmPredicate());
		System.out.println("passed first stage !");
		for(Candidate x:passed1) {
			System.out.println(x);
		}
		
		List<Candidate> passed2 = filter(passed1,new CandidateCSKnowledgePredicate());
		System.out.println("passed second stage! congretdulations!");
		for(Candidate x:passed2) {
			System.out.println(x);
		}
	}
	
	//전달한 predicate 객체에 따라 동작이 결정된다!
	//동작 파라미터화!
	public static List<Candidate> filter(List<Candidate> Candidates,CandidatePredicate p){
		List<Candidate> result= new ArrayList<>();
		for(Candidate x:Candidates) {
			if(p.test(x)) result.add(x);
		}
		return result;
	}
	
	interface CandidatePredicate{
		public boolean test(Candidate x);
	}

	static class CandidateAlgorithmPredicate implements CandidatePredicate{
		@Override
		public boolean test(Candidate x) {
			return x.getAlgorithmScore()>80;
		}
	}
	
	static class CandidateCSKnowledgePredicate implements CandidatePredicate{
		@Override
		public boolean test(Candidate x) {
			return x.getCSKnowledgeScore()>70;
		}
	}
	
//	static class CandidateAlgo_CS_Predicate implements CandidatePredicate{
//		@Override
//		public boolean test(Candidate x) {
//			return x.getAlgorithmScore()>80 && x.getCSKnowledgeScore()>70;
//		}
//	}
	
	static class Candidate{
		private int algorithmScore;
		private int CSKnowledgeScore;
		
		public Candidate(int algorithmScore,int CSKnowledgeScore) {
			this.algorithmScore=algorithmScore;
			this.CSKnowledgeScore=CSKnowledgeScore;
		}
		
		public int getAlgorithmScore() {
			return this.algorithmScore;
		}
		
		public void setAlogirhtmScore(int algorithmScore) {
			this.algorithmScore=algorithmScore;
		}
		
		public int getCSKnowledgeScore() {
			return this.CSKnowledgeScore;
		}
		
		public void setCSKnowledgeScore(int CSKnowledgeScore) {
			this.CSKnowledgeScore=CSKnowledgeScore;
		}
		
		@Override
		public String toString() {
			return algorithmScore+" "+CSKnowledgeScore;
		}
		
	}
}





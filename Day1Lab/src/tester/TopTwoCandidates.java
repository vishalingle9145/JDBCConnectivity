package tester;

import java.util.List;

import dao.CandidateDaoImpl;
import pojos.Candidate;

public class TopTwoCandidates {

	public static void main(String[] args) {
		
		
		try {
			
			CandidateDaoImpl candidate = new CandidateDaoImpl();
			
			List<Candidate> list = candidate.topTwoCandidates();
			for(Candidate c : list)
			{
				System.out.println(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

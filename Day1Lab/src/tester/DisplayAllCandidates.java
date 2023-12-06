package tester;

import java.util.List;
import java.util.Scanner;

import dao.CandidateDaoImpl;
import pojos.Candidate;

public class DisplayAllCandidates {

	public static void main(String[] args) {
		
		
		try{
			
			CandidateDaoImpl candidate = new CandidateDaoImpl();
			
			List<Candidate> list = candidate.getAllCandidates();
			
			for(Candidate c : list)
			{
				System.out.println(c);
			}
			
			
			candidate.cleanUp();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

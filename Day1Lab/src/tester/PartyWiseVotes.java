package tester;

import java.util.Map;
import java.util.Map.Entry;

import dao.CandidateDaoImpl;

public class PartyWiseVotes {

	public static void main(String[] args) {
		
		try {
			
			CandidateDaoImpl candidate = new CandidateDaoImpl();
			
			Map<String, Integer> map = candidate.partyWiseVotes();
			
			for(Map.Entry<String, Integer> c : map.entrySet())
			{
				System.out.println(c.getKey()+"  	    "+c.getValue());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

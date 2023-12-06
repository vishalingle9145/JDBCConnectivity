package tester;

import java.util.Scanner;

import dao.CandidateDaoImpl;

public class IncrementVotes {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			CandidateDaoImpl candidate = new CandidateDaoImpl();
			
			System.out.println("Enter Id to Vote: ");
			System.out.println(candidate.incrementVotes(sc.nextInt()));
			
			candidate.cleanUp();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Ballot {
    public static final String [] candidates = {"chocolate", "vanilla", "strawberry", "oreo"};
    public String [] votes;
    public static final String [] candidateLetters = {"A", "B", "C", "D"};


    public Ballot () {
        votes = new String [candidates.length];
    }

    public Ballot (String vA, String vB, String vC, String vD) {
        votes = new String [4];
        votes[0] = vA; 
        votes[1] = vB;
        votes[2] = vC;
        votes[3] = vD;
    }

    public void castVote() {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> toCheck = new ArrayList <>();

        for (int i = 0; i <candidates.length; i++) {
            while (true) {
                System.out.println("Enter your choice #" + (i + 1) + " (A: chocolate, B: vanilla, C: strawberry, D: oreo):");
                String vote = scanner.nextLine().toUpperCase(); 
                if (!isValidCandidate(vote)) {
                    System.out.println("Invalid. Please enter A, B, C or D");
                    continue;

                }
                if (toCheck.contains(vote)) {
                    System.out.println("You have already voted for that candidate");
                    continue;
                }
                int index = vote.charAt(0) - 'A';
                votes[i] = candidates[index]; 
                toCheck.add(vote);
                break;

            }
        }
    }
    private static boolean isValidCandidate(String input) {
        for (String c : candidateLetters) {
            if (c.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

    public String [] getVoteList() {  
        return votes; 
    }

    public static String [] getCandidatesList() {
        return candidates;
    }
    
    public String toString() {
        return votes[0] + "," + votes[1] + "," + votes[2] + "," + votes[3];
    }

}
import java.util.ArrayList;

public class BallotTester {
    public static void main (String[] args) {
        Ballot v1 = new Ballot ("A", "C", "D", "B");
        Ballot v2 = new Ballot ("D", "B", "C", "A");
        Ballot v3 = new Ballot ("C", "B", "A", "D");
        Ballot v4 = new Ballot ("D", "B", "A", "C");
        Ballot v5 = new Ballot ();
        v5.castVote();
        ArrayList<Ballot> allVotes = new ArrayList<>();
        allVotes.add(v1);
        allVotes.add(v2);
        allVotes.add(v3);
        allVotes.add(v4);
        allVotes.add(v5);
        Tally t = new Tally (allVotes);
        t.countNext();
        System.out.println(t); 
    
    }
    
}
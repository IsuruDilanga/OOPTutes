package DesigningAndImplementingAClass;

public class VotingMachine {

    private int labourVote;
    private int conservativeVote;

    public VotingMachine(){
        labourVote = 0;
        conservativeVote = 0;
    }

    public void clearVote(){
        this.labourVote = 0;
        this.conservativeVote = 0;
    }

    public void voteForLabour(){
        this.labourVote++;
    }

    public void secreteVote(){
        int random = (int) (Math.random() * 10);
        this.labourVote += random;
    }

    public void voteForConservative(){
        this.conservativeVote++;
    }

    public int getLabourVote(){
        return this.labourVote;
    }

    public int getConservativeVote(){
        return this.conservativeVote;
    }
}

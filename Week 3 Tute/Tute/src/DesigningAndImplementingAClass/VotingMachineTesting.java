package DesigningAndImplementingAClass;

import java.util.Scanner;

public class VotingMachineTesting {

    public static void main(String[] args) {

        VotingMachine vote = new VotingMachine();
        Scanner input = new Scanner(System.in);

        boolean runVote = true;
        while (runVote){
            System.out.println("""
                A: Clear Vote
                B: Vote for a Labour
                C: Vote for a Conservative
                D: Get the number of Vote
                E: Quit""");

//            int random = (int) (Math.random() * 2);
//            if (random == 0){
//                vote.voteForLabour();
//            } else if (random == 1){
//                vote.voteForConservative();
//            }
            vote.secreteVote();

            switch (Character.toUpperCase(input.next().charAt(0))){
                case 'A'->vote.clearVote();
                case 'B'->vote.voteForLabour();
                case 'C'->vote.voteForConservative();
                case 'D'->System.out.println("Labour Vote: " + vote.getLabourVote() + "\n" + "Conservative Vote: " + vote.getConservativeVote() + "\n");
                case 'E'->runVote = false;
            }
        }
    }
}

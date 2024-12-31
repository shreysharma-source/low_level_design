package LLD.Questions.Crickbuzz;

public class T20MatchType implements MatchType{
    public int getNumberOfOvers(){
        return 20;
    }

    public int getMaxOversPerBowler(){
        return 4;
    }
}

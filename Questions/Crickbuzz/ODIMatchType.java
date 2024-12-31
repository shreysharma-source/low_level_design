package LLD.Questions.Crickbuzz;

public class ODIMatchType implements MatchType{
    public int getNumberOfOvers(){
        return 50;
    }

    public int getMaxOversPerBowler(){
        return 10;
    }
}

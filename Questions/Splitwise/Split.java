package LLD.Questions.Splitwise;

public class Split {
    User user;
    double amount;

    public Split(User iUser, int iAmount){
        user = iUser;
        amount = iAmount;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User iUser){
        this.user = iUser;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double iAmount){
        this.amount = iAmount;
    }
}

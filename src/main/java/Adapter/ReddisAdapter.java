package Adapter;

public class ReddisAdapter implements Database{
    ReddisInsight reddisInsight;
    public  ReddisAdapter(ReddisInsight reddisInsight){
        this.reddisInsight = reddisInsight;
    }
    @Override
    public void select() {
        reddisInsight.read();
    }

    @Override
    public void insert() {
        reddisInsight.save();

    }

    @Override
    public void delete() {
        reddisInsight.remove();

    }

    @Override
    public void update() {
        reddisInsight.change();

    }
}

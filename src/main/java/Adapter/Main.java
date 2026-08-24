package Adapter;

public class Main {
    static void main() {
        ReddisInsight reddisInsight = new ReddisInsight();
        Database database = new ReddisAdapter(reddisInsight);
        database.update();
        database.delete();
        database.select();
        database.insert();
    }

}

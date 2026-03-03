package practice5.task3;

public class Menu {
    private Dish dish;
    public void addDish(Dish dish){
        this.dish = dish;
    }
    public void showMenu(){
        if(dish == null){
            System.out.println("В меню не добавлено блюдо");
        }else {
            dish.getDescription();
        }
    }

    static void main() {
        Dish drink = new Drink(70);
        Dish hotDish = new HotDish(60);
        Menu menu = new Menu();
        menu.addDish(hotDish);
        menu.showMenu();
    }

}

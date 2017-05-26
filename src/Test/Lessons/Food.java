package Test.Lessons;

class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}
public class Food {
    int x=10;
    Popcorn p = new Popcorn() {
        public void pop() {
            x=32;
            System.out.println("anonymous popcorn");
        }
    };
    public static void main(String[]args){
        Food food = new Food();
        food.p.pop();
    }
}

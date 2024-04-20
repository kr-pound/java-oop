//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var box1 = new Object();
        var box2 = box1;
        System.out.println(box2);
        System.out.println(box1.hashCode());
    }
}
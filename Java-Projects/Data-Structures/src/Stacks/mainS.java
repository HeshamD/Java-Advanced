package Stacks;

public class mainS {
    public static void main(String[] args) {
        Stack1 s = new Stack1();

        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(0);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}

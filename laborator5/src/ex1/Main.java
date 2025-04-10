//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Smartphone smartphone = new Smartphone();

        System.out.println("Smartphone: " + smartphone.getDuration());

        Clock clock = new Clock();

        System.out.println(clock.getTime());

        Timer timer = new Smartphone();

        System.out.println(timer.getDuration());

    }
}
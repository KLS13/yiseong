public class CalculatorMain {
    public static void execute(Calculator cal){
        System.out.println("실행결과");
        cal.run();
    }

    public static void main(String[] args) {
        Calculator c1 = new Plus();
        c1.setOprands(10, 20);

        Calculator c2 = new Minus();
        c2.setOprands(10, 20);

        execute(c1);
        execute(c2);
    }
}
abstract class Calculator{
    int x, y;
    public void setOprands(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
    int _sum() {
        return this.x + this.y;
    }
}
class Plus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+ _sum()/2);
    }
}
class Minus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+ _sum()/2);
    }
}


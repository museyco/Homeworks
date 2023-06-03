public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mohammad",15,150,100,50);
        Fighter f2 = new Fighter("Ali",25,100,100,30);

        Match match = new Match(f1,f2,150,0);
        match.run();
    }
}
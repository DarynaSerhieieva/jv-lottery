package core.basesyntax;

public class Application {
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        logicalOp.counting(21);
        logicalOp.negativeCounting(100);
        logicalOp.countingInBetween(50, 57);
        logicalOp.countingMinToMax(23, 18);
        logicalOp.increasingEvens();
        logicalOp.increasingOdds();
        System.out.println(logicalOp.addAndAverage(11, 8899));
        System.out.println(logicalOp.boltz(2, 22));
        logicalOp.fibonacci();
        logicalOp.printCozaLozaWoza();
    }
}

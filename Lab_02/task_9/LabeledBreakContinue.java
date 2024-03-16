class LabeledBreakContinueTest {
    public static void main(String[] args) {
        labeledBreakContinue();
    }

    public static void labeledBreakContinue() {
        outerLoop:
        for (int i = 0; i < 3; i++) {
            innerLoop:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outerLoop;
                }
                if (i == 0 && j == 1) {
                    continue innerLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
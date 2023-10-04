import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Answer answer = new Answer();
        int[] digitOfThreeAnswer;
        digitOfThreeAnswer = answer.setAnswer();

        boolean isThreeStrike = true;
        while (isThreeStrike) {
            System.out.println("값을 입력하세요.");

            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();
            // 정답 보여주기(오류 확인용)
            if(inputNumber == 1){
                System.out.printf("%d %d %d\n",digitOfThreeAnswer[0],digitOfThreeAnswer[1],digitOfThreeAnswer[2]);
            }


            int[] digitOfInputNumber = new int[3];
            for (int i = 2; i >= 0; --i) {
                digitOfInputNumber[i] = inputNumber % 10;
                inputNumber /= 10;
            }


            int strike = 0;
            int ball = 0;
            int out = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (digitOfThreeAnswer[i] == digitOfInputNumber[j]) {
                        if (i == j) {
                            strike += 1;
                        } else {
                            ball += 1;
                        }
                    }
                }
            }
            out = 3 - strike - ball;

            System.out.printf("strike : %d, ball : %d, out : %d\n", strike, ball, out);
            System.out.println("----------------------------------------------------");

            if (strike == 3) {
                System.out.println("정답입니다~!! 3 Strike!!!");
                isThreeStrike = false;
            }
        }
    }
}
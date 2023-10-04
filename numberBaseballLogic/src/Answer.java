public class Answer {
    int answer;
    int[] digitOfThreeAnswer = new int[3];

    // Answer 설정
    public int[] setAnswer() {
        while (true) {
            answer = (int) (Math.random() * 1000);
            for (int i = 2; i >= 0; --i) {
                digitOfThreeAnswer[i] = answer % 10;
                answer /= 10;
            }
            // random값으로 설정된 각 자리수 확인
//            System.out.printf("Answer : %d, %d, %d\n",digitOfThreeAnswer[0],digitOfThreeAnswer[1],digitOfThreeAnswer[2]);

            // 3자리 정수에 중복된 수가 있는지 확인
            if(checkNumberOfDuplicate(digitOfThreeAnswer[0],digitOfThreeAnswer[1],digitOfThreeAnswer[2])){
                continue;
            }
            break;
        }

        return digitOfThreeAnswer;
    }

    // Answer 각 자리수 중복 값 확인
    public boolean checkNumberOfDuplicate(int num0,int num1,int num2){
        if(num0 == num1 || num0 == num2 || num1 == num2){
            return true;
        }
        return false;
    }

}

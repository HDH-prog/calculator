import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 반복 연산 위해 배열 생성
        double[] results = new double[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            // 양의 정수 2개를 입력
            System.out.print("첫 번째 숫자를 입력하세요(양의 정수): ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요(양의 정수): ");
            int num2 = sc.nextInt();

            // 사칙연산 기호 타입 변수에 저장
            System.out.print("사칙연산 기호를 입력하세요((+, -, *, /): ");
            char operator = sc.next().charAt(0);

            // 변수 초기화 -> 타입은 double(나눗셈 소수점 연산 위해)
            double result = 0;

            // 연산자 처리
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // 분모 0 처리
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    result = (double) num1 / num2;
                    break;
                // 사칙연산 기호에는 +, -, *, / 만 가능
                default:
                    System.out.println("올바른 사칙연산 기호가 아닙니다. (+, -, *, / 만 가능)");
                    continue;
            }
            System.out.println("결과: " + result);

            // 반복 연산 계산
            results[count] = result;
            count++;

            // exit 전까지 연산 반복
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input = sc.next();
            if (input.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}
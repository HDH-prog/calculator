import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // 반복 연산 위해 컬렉션(리스트) 사용
        List<Double> results = new ArrayList<>();
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

            // 연산 결과 리스트에 저장
            results.add(result);

            // remove 입력 시 첫 번째 연산 결과 제거
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String input = sc.next();
            if (input.equals("remove")) {
                results.remove(0);
            }
            // inquiry 입력 시 연산 결과 반환
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            input = sc.next();
            if (input.equals("inquiry")) {
                for (double i : results) {
                    System.out.print(i + ", ");
                }
            }



            // exit 전까지 연산 반복
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            input = sc.next();
            if (input.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}
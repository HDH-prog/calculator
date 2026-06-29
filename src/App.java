import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Calculator 인스턴스
        Calculator calculator = new Calculator();

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

            // Calculator의 calculate 메서드로 연산자 처리
            double result = calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            // remove 입력 시 첫 번째 연산 결과 제거
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String input = sc.next();
            if (input.equals("remove")) {
                calculator.results.remove(0);
            }
            // inquiry 입력 시 연산 결과 반환
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            input = sc.next();
            if (input.equals("inquiry")) {
                for (double i : calculator.results) {
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
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Calculator 인스턴스
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {


            // 사칙연산 | 원 넓이
            System.out.println("어떤 기능을 사용하시겠습니까? (calc: 사칙연산, circle: 원의 넓이)");
            String mode = sc.next();

            if (mode.equals("circle")) {
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();

                double area = calculator.calculateCircleArea(radius);
                System.out.println("원의 넓이: " + area);

                System.out.println("저장된 원의 넓이 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String input = sc.next();
                if (input.equals("inquiry")) {
                    calculator.inquiryCircleAreaResults();
                }

            } else if (mode.equals("calc")) {
                // 기존 사칙연산 분기
                System.out.print("첫 번째 숫자를 입력하세요(양의 정수): ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요(양의 정수): ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
                char operator = sc.next().charAt(0);

                String input = "";

            // Calculator의 calculate 메서드로 연산자 처리
            try {
                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);

                // remove 입력 시 첫 번째 연산 결과 제거
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                input = sc.next();
                if (input.equals("remove")) {
                    calculator.removeResults();
                }
                // inquiry 입력 시 연산 결과 반환
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                input = sc.next();
                if (input.equals("inquiry")) {
                    calculator.inquiryResults();
                }
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
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
}}
import java.util.List;
import java.util.ArrayList;

public class Calculator {

    public static final double PI = 3.14159;

    // 컬렉션 타입 필드
    private List<Double> results = new ArrayList<>();
    private List<Double> circleAreaResults;

    // 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 사칙연산 메서드
    public double calculate(int num1, int num2, char operator) {

        double result = 0;

        switch (operator) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 == 0) {
                    throw new ArithmeticException("분모에 0 불가함");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("올바른 사칙연산 기호가 아닙니다.");
        }

        // 연산 결과
        results.add(result);
        return result;
    }

    // Getter
    public List<Double> getResults() {
        return results;
    }

    // Setter
    public void setResults(List<Double> results) {
        this.results = results;
    }

    // remove 메서드
    public void removeResults() {
        results.remove(0);
        System.out.println("삭제되었습니다.");
    }

    // inquiry 메서드
    public void inquiryResults() {
        for (Double i : results) {
            System.out.println(i);
        }
    }

    // 원의 넓이 계산 메서드: 반지름을 받아 넓이 계산 후 결과 저장
    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        circleAreaResults.add(area);
        return area;
    }

    // 원의 넓이 결과 Getter
    public List<Double> getCircleAreaResults() {
        return circleAreaResults;
    }

    // 원의 넓이 결과 Setter
    public void setCircleAreaResults(List<Double> circleAreaResults) {
        this.circleAreaResults = circleAreaResults;
    }

    // 원의 넓이 결과 전체 조회
    public void inquiryCircleAreaResults() {
        if (circleAreaResults.isEmpty()) {
            System.out.println("저장된 원의 넓이 결과가 없습니다.");
        } else {
            for (Double area : circleAreaResults) {
                System.out.println(area);
            }
        }
    }
}
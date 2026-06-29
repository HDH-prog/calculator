import java.util.List;
import java.util.ArrayList;

public class Calculator {

    // 컬렉션 타입 필드
    private List<Double> results = new ArrayList<>();

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
}
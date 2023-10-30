package racingcar.view;

import java.util.regex.Pattern;

public class Console {

    private static final Pattern REGEX = Pattern.compile("^[0-9]*$");

    private final Input input;
    private final Output output;

    public Console(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public String readCarNames() {
        output.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String value = input.read();
        validateNull(value);

        return value;
    }

    public int readNumberOfTrials() {
        output.println("시도할 회수는 몇회인가요?");
        String value = input.read();
        validate(value);

        return Integer.parseInt(value);
    }

    private void validate(String value) {
        validateNull(value);
        validateType(value);
    }

    private void validateNull(String value) {
        if (value == null) {
            throw new IllegalArgumentException("시도 횟수를 입력해주세요.");
        }
    }

    private void validateType(String value) {
        if (!isNumeric(value)) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }

    private boolean isNumeric(String value) {
        return REGEX.matcher(value).matches();
    }

}

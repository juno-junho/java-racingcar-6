package racingcar.controller;

import racingcar.domain.CarNames;
import racingcar.view.Console;

public class RacingCarGame {

    private final Console console;

    public RacingCarGame(Console console) {
        this.console = console;
    }

    public void run() {
        CarNames carNames = new CarNames(console.readCarNames());

    }

}

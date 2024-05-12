package com.javarush.cryptoanalyzer.ruban.app;

import com.javarush.cryptoanalyzer.ruban.controller.MainController;
import com.javarush.cryptoanalyzer.ruban.entity.Result;
import com.javarush.cryptoanalyzer.ruban.repository.FunctionCode;
import com.javarush.cryptoanalyzer.ruban.services.Function;

import static com.javarush.cryptoanalyzer.ruban.constants.FunctionCodeConstants.*;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Result run() {
        String[] parameters = mainController.getView().getParameters();
        String mode = parameters[0];
        Function function = getFunction(mode);
        return function.execute(parameters);
    }

    private Function getFunction(String mode) {
        return switch (mode) {
            case "1" -> FunctionCode.valueOf(ENCODE).getFunction();
            case "2" -> FunctionCode.valueOf(DECODE).getFunction();
            default -> FunctionCode.valueOf(UNSUPPORTED_FUNCTION).getFunction();
        };
    }

    public void printResult(Result result) {
        mainController.getView().printResult(result);
    }
}

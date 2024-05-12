package com.javarush.cryptoanalyzer.ruban.view;

import com.javarush.cryptoanalyzer.ruban.entity.Result;

import static com.javarush.cryptoanalyzer.ruban.constants.ApplicationCompletionConstants.EXCEPTION;
import static com.javarush.cryptoanalyzer.ruban.constants.ApplicationCompletionConstants.SUCCESS;

public class ConsoleView implements View {
    @Override
    public String[] getParameters() {
        return new String[0];
        //TODO Прописать логику работы с консолью
    }

    @Override
    public void printResult(Result result) {
        switch (result.getResultCode()) {
            case OK -> System.out.println(SUCCESS);
            case ERROR -> System.out.println(EXCEPTION + result.getApplicationException().getMessage());
        }
    }
}

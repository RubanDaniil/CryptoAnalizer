package com.javarush.cryptoanalyzer.ruban.view;

import com.javarush.cryptoanalyzer.ruban.entity.Result;

import static com.javarush.cryptoanalyzer.ruban.constants.ApplicationCompletionConstants.EXCEPTION;
import static com.javarush.cryptoanalyzer.ruban.constants.ApplicationCompletionConstants.SUCCESS;

public class GUIView implements View{
    @Override
    public String[] getParameters() {
        return new String[0];
    }

    @Override
    public void printResult(Result result) {
        switch (result.getResultCode()) {
            case OK -> System.out.println(SUCCESS);
            case ERROR -> System.out.println(EXCEPTION + result.getApplicationException().getMessage());
        }
    }
}

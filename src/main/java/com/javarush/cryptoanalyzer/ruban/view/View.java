package com.javarush.cryptoanalyzer.ruban.view;

import com.javarush.cryptoanalyzer.ruban.entity.Result;

public interface View {
    String[] getParameters();
    void printResult(Result result);
}

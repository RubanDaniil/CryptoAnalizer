package com.javarush.cryptoanalyzer.ruban.services;

import com.javarush.cryptoanalyzer.ruban.entity.Result;

public class unsupportedFunction implements Function {
    @Override
    public Result execute(String[] parameters) {
        return null;
    }
}

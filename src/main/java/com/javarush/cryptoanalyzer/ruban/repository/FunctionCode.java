package com.javarush.cryptoanalyzer.ruban.repository;

import com.javarush.cryptoanalyzer.ruban.services.Decode;
import com.javarush.cryptoanalyzer.ruban.services.Encode;
import com.javarush.cryptoanalyzer.ruban.services.Function;
import com.javarush.cryptoanalyzer.ruban.services.unsupportedFunction;

public enum FunctionCode {
    ENCODE(new Encode()), DECODE(new Decode()), UNSUPPORTED_FUNCTION(new unsupportedFunction());
    private Function function;

    FunctionCode(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }
}

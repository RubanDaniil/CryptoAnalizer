package com.javarush.cryptoanalyzer.ruban.services;

import com.javarush.cryptoanalyzer.ruban.entity.Result;
import com.javarush.cryptoanalyzer.ruban.exception.ApplicationException;
import com.javarush.cryptoanalyzer.ruban.repository.ResultCode;

public class Decode implements Function {
    @Override
    public Result execute(String[] parameters) {
        try {
            //TODO Код для расшифровки
        } catch (Exception e ) {
            return new Result(ResultCode.ERROR, new ApplicationException("Decode operation finished with exception", e));
        }
        return new Result(ResultCode.OK);
    }
}

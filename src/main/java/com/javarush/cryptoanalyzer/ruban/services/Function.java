package com.javarush.cryptoanalyzer.ruban.services;

import com.javarush.cryptoanalyzer.ruban.entity.Result;

public interface Function {
    Result execute(String[] parameters);
}

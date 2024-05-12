package com.javarush.cryptoanalyzer.ruban.entity;

import com.javarush.cryptoanalyzer.ruban.exception.ApplicationException;
import com.javarush.cryptoanalyzer.ruban.repository.ResultCode;

public class Result {
    private ResultCode resultCode;
    private ApplicationException applicationException;

    public Result(ResultCode resultCode, ApplicationException decodeOperationFinishedWithException) {
        this.resultCode = resultCode;
    }

    public Result(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public ApplicationException getApplicationException() {
        return applicationException;
    }
}

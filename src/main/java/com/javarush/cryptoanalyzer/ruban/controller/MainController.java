package com.javarush.cryptoanalyzer.ruban.controller;

import com.javarush.cryptoanalyzer.ruban.view.View;

public class MainController {
    private View view;

    public MainController(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }
}

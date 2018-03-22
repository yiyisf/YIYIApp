package com.yiyi.app.cucumber.stepdefs;

import com.yiyi.app.YiyiApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = YiyiApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

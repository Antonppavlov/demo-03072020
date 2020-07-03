package ru.appavlov.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "pretty"},
        tags = "@mrt_regress",
        features = "src/test/resources/features",
        glue = {"ru"}
)
public class RunFeaturesTest {

}

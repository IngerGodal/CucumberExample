package ru.inger.cucumbertest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "ru.inger.cucumbertest",
        tags = "@withdraws, @menu",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTest {
}

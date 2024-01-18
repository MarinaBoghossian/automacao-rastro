package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Feature/Cadastros.feature", "src/test/resources/Feature/Login.feature"},
		glue = "Steps",
		tags =
				"@cadastroproduto",

        plugin = {
				"pretty", "html:target/selenium-reports"}, monochrome = true, dryRun = false)
class Runner {

}

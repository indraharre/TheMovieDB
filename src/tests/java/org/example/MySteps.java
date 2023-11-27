package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySteps {

    WebDriver webDriver = new FirefoxDriver();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        webDriver.get("https://www.themoviedb.org/");
    }

    @Given("There is a search bar")
    public void there_is_a_search_bar() {
        WebElement searchInput = webDriver.findElement(By.cssSelector("#inner_search_v4"));
        Assertions.assertNotNull(searchInput, "Search bar not found");

        // Validate that the placeholder of the search input is 'Search for a movie, tv show, person......'
        Assertions.assertEquals("Zoeken naar een film, tv-serie of persoon......", searchInput.getAttribute("placeholder"));
    }

    @Given("I enter the name Oppenheimer")
    public void i_enter_the_name_oppenheimer() {
        WebElement searchInput = webDriver.findElement(By.cssSelector("#inner_search_v4"));
        searchInput.sendKeys("Oppenheimer");
    }

    @Given("I click the search button")
    public void i_click_the_search_button() {
        WebElement searchButton = webDriver.findElement(By.cssSelector("#inner_search_form input[type='submit']"));
        searchButton.click();
    }

    @Given("the first item should be the profile of Oppenheimer")
    public void the_first_item_should_be_the_profile_of_oppenheimer() {

    }
    @When("I click the Search button")
    public void iClickTheSearchButton() {
    }
    @Then("The first item should the profile of Oppenheimer")
    public void theFirstItemShouldTheProfileOfOppenheimer() {
    }
    @Given("Clean Up")
    public void clean_up() {
        webDriver.close();
    }
}

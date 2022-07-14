package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class GettingStartedTest extends TestBase {

    @Test
    void gettingStartedTest() {
        step("Проверка текста на стартовом экране", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                      .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });
        step("Переход на вторую страницу и проверка текста", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                      .shouldHave(text("New ways to explore"));
        });
        step("Переход на третью страницу и проверка текста", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                      .shouldHave(text("Reading lists with sync"));
        });
        step("Переход на четвёртую страницу и проверка текста", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                      .shouldHave(text("Send anonymous data"));
        });
    }

    @Test
    void searchTest() {
        back();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content found", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                      .shouldHave(CollectionCondition.sizeGreaterThan(0)));
    }

    @Test
    void historyTests() {
        back();
        step("Открыть историю и проверить ее отсутствие", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_search")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/history_empty_title"))
                      .shouldHave(text("No recently viewed articles"));
        });
        step("Ввести в поиск World of Tanks", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_card")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("World of Tanks");
        step("Проверка содержимого", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                      .shouldHave(CollectionCondition.sizeGreaterThan(0)));
        step("Открыть статью World of Tanks", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                      .find(text("World of Tanks")).click();
            });
        back();
        back();
        back();
        step("Проверка истории на World of Tanks", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                      .shouldHave(text("World of Tanks"));
            });
        });
    }

    @Test
    void checkTextStartScreen() {
        back();
        step("Проверить текст", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"))
                    .shouldHave(text("Customize your Explore feed You can now choose what to show on your feed," +
                            " and also prioritize your favorite types of content."));
        });
    }

    @Test
    void moreMenuContainsDonateItem() {
        back();
        step("Открыть меню 'More'", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/nav_more_container")).click());
        step("Проверить существования кнопки 'Donate'", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/main_drawer_donate_container"))
                        .isDisplayed());
    }
}

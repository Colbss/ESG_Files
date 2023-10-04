package zone.eloy.projects.androidcalculator;

import androidx.appcompat.widget.*;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class AC_ESG_1 {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule =
        new ActivityScenarioRule<>(MainActivity.class);

   @Test
   public void Test() {

        ViewInteraction MainActivity_NumberInput_1 = onView(
            allOf(withId(R.id.textView_input_numbers), isDisplayed()));
        MainActivity_NumberInput_1.check(matches(withSubstring("")));

        ViewInteraction MainActivity_ButtonParentheses_1 = onView(
            allOf(withId(R.id.button_parentheses), isDisplayed()));
        MainActivity_ButtonParentheses_1.perform(click());

        ViewInteraction MainActivity_ButtonAppend5_1 = onView(
            allOf(withId(R.id.button_five), isDisplayed()));
        MainActivity_ButtonAppend5_1.perform(click());

        ViewInteraction MainActivity_ButtonAppend0_1 = onView(
            allOf(withId(R.id.button_zero), isDisplayed()));
        MainActivity_ButtonAppend0_1.perform(click());

        ViewInteraction MainActivity_ButtonDivide_1 = onView(
            allOf(withText("÷"), withId(R.id.button_division), isDisplayed()));
        MainActivity_ButtonDivide_1.perform(click());

        ViewInteraction MainActivity_ButtonAppend5_2 = onView(
            allOf(withId(R.id.button_five), isDisplayed()));
        MainActivity_ButtonAppend5_2.perform(click());

        ViewInteraction MainActivity_ButtonParentheses_2 = onView(
            allOf(withId(R.id.button_parentheses), isDisplayed()));
        MainActivity_ButtonParentheses_2.perform(click());

        ViewInteraction MainActivity_ButtonMultiply_1 = onView(
            allOf(withId(R.id.button_multiplication), isDisplayed()));
        MainActivity_ButtonMultiply_1.perform(click());

        ViewInteraction MainActivity_ButtonAppend2_1 = onView(
            allOf(withId(R.id.button_two), isDisplayed()));
        MainActivity_ButtonAppend2_1.perform(click());

        ViewInteraction MainActivity_ButtonEqual_1 = onView(
            allOf(withId(R.id.button_equal), isDisplayed()));
        MainActivity_ButtonEqual_1.perform(click());

        ViewInteraction MainActivity_NumberInput_2 = onView(
            allOf(withId(R.id.textView_input_numbers), isDisplayed()));
        MainActivity_NumberInput_2.check(matches(withSubstring("20")));

    }
}

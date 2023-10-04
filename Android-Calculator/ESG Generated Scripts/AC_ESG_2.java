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
public class AC_ESG_2 {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule =
        new ActivityScenarioRule<>(MainActivity.class);

   @Test
   public void Test() {

        // THIS TEST WILL FAIL AS CALCULATOR APPLICATION
        // CALCULATES ANSWER INCORRECTLY

        ViewInteraction MainActivity_NumberInput_1 = onView(
            allOf(withId(R.id.textView_input_numbers), isDisplayed()));
        MainActivity_NumberInput_1.check(matches(withSubstring("")));

        ViewInteraction MainActivity_ButtonAppend1_1 = onView(
            allOf(withId(R.id.button_one), isDisplayed()));
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());
        MainActivity_ButtonAppend1_1.perform(click());

        ViewInteraction MainActivity_ButtonAppend2_1 = onView(
            allOf(withId(R.id.button_two), isDisplayed()));
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());
        MainActivity_ButtonAppend2_1.perform(click());

        ViewInteraction MainActivity_ButtonMultiply_1 = onView(
            allOf(withId(R.id.button_multiplication), isDisplayed()));
        MainActivity_ButtonMultiply_1.perform(click());

        ViewInteraction MainActivity_ButtonAppend1_2 = onView(
            allOf(withId(R.id.button_one), isDisplayed()));
        MainActivity_ButtonAppend1_2.perform(click());

        ViewInteraction MainActivity_ButtonAppend0_1 = onView(
            allOf(withId(R.id.button_zero), isDisplayed()));
        MainActivity_ButtonAppend0_1.perform(click());

        ViewInteraction MainActivity_ButtonEqual_1 = onView(
            allOf(withId(R.id.button_equal), isDisplayed()));
        MainActivity_ButtonEqual_1.perform(click());

        ViewInteraction MainActivity_NumberInput_2 = onView(
            allOf(withId(R.id.textView_input_numbers), isDisplayed()));
        MainActivity_NumberInput_2.check(matches(withSubstring("1111111112222222220")));

    }
}

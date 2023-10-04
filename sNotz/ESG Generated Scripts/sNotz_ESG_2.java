package com.sunilpaulmathew.snotz;

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
public class sNotz_ESG_2 {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule =
        new ActivityScenarioRule<>(MainActivity.class);

   @Test
   public void Test() {

        ViewInteraction Introduction_SkipButton_1 = onView(
            allOf(withText("SKIP"), withId(R.id.skip), isDisplayed()));
        Introduction_SkipButton_1.perform(click());

        ViewInteraction MainActivity_AddNote_1 = onView(
            allOf(withId(R.id.add_note_card), isDisplayed()));
        MainActivity_AddNote_1.perform(click());

        ViewInteraction AddItem_AddNote_1 = onView(
            allOf(withSubstring("Note"), withId(android.R.id.text1), isDisplayed()));
        AddItem_AddNote_1.perform(click());

        ViewInteraction Note_Content_1 = onView(
            allOf(withId(R.id.contents), isDisplayed()));
        Note_Content_1.perform(replaceText("My Note"));

        ViewInteraction Note_SaveButton_1 = onView(
            allOf(withId(R.id.save_button), isDisplayed()));
        Note_SaveButton_1.perform(click());

        ViewInteraction MainActivity_SelectNote_1 = onView(
            allOf(withId(R.id.contents), isDisplayed()));
        MainActivity_SelectNote_1.check(matches(withSubstring("My Note")));

    }
}

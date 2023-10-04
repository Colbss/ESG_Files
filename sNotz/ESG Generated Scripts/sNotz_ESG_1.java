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
public class sNotz_ESG_1 {

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

        ViewInteraction AddItem_AddChecklist_1 = onView(
            allOf(withId(android.R.id.text1), withText("Checklist"), isDisplayed()));
        AddItem_AddChecklist_1.perform(click());

        ViewInteraction ChecklistDialog_ChecklistName_1 = onView(
            allOf(isAssignableFrom(AppCompatEditText.class), withText(""), isDisplayed()));
        ChecklistDialog_ChecklistName_1.perform(click());

        ViewInteraction ChecklistDialog_ChecklistName_2 = onView(
            allOf(isAssignableFrom(AppCompatEditText.class), withText(""), isDisplayed()));
        ChecklistDialog_ChecklistName_2.perform(replaceText("My Checklist"));

        ViewInteraction ChecklistDialog_OkButton_1 = onView(
            allOf(withId(android.R.id.button1), withText("OK"), isDisplayed()));
        ChecklistDialog_OkButton_1.perform(click());

        ViewInteraction Checklist_EditChecklistItem_1 = onView(
            allOf(withText(""), withId(R.id.title), isDisplayed()));
        Checklist_EditChecklistItem_1.perform(click());

        ViewInteraction Checklist_EditChecklistItem_2 = onView(
            allOf(withText(""), withId(R.id.title), isDisplayed()));
        Checklist_EditChecklistItem_2.perform(replaceText("Apples\n"));

        ViewInteraction Checklist_EditChecklistItem_3 = onView(
            allOf(withText(""), withId(R.id.title), isDisplayed()));
        Checklist_EditChecklistItem_3.perform(click());

        ViewInteraction Checklist_EditChecklistItem_4 = onView(
            allOf(withText(""), withId(R.id.title), isDisplayed()));
        Checklist_EditChecklistItem_4.perform(replaceText("Eggs\n"));

        ViewInteraction Checklist_EditChecklistItem_5 = onView(
            allOf(withText(""), withId(R.id.title), isDisplayed()));
        Checklist_EditChecklistItem_5.perform(click());

        ViewInteraction Checklist_EditChecklistItem_6 = onView(
            allOf(withText(""), withId(R.id.title), isDisplayed()));
        Checklist_EditChecklistItem_6.perform(replaceText("Bread"));

        ViewInteraction Checklist_SaveButton_1 = onView(
            allOf(withId(R.id.save_button), isDisplayed()));
        Checklist_SaveButton_1.perform(click());

        ViewInteraction MainActivity_SelectChecklist_1 = onView(
            allOf(withId(R.id.contents), isDisplayed()));
        MainActivity_SelectChecklist_1.check(matches(withSubstring("Eggs")));

    }
}

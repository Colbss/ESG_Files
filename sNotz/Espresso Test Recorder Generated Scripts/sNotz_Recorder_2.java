package com.sunilpaulmathew.snotz;


import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.sunilpaulmathew.snotz.activities.StartActivity;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class sNotz_Recorder_2 {

    @Rule
    public ActivityScenarioRule<StartActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(StartActivity.class);

    @Test
    public void recorder_Seq_2() {
        ViewInteraction materialCardView = onView(
                allOf(withId(R.id.start_card),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialCardView.perform(click());

        ViewInteraction materialTextView = onView(
                allOf(withId(R.id.skip), withText("SKIP"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.appcompat.widget.LinearLayoutCompat")),
                                        1),
                                1),
                        isDisplayed()));
        materialTextView.perform(click());

        ViewInteraction materialCardView2 = onView(
                allOf(withId(R.id.add_note_card),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_container),
                                        0),
                                1),
                        isDisplayed()));
        materialCardView2.perform(click());

        DataInteraction materialTextView2 = onData(anything())
                .inAdapterView(allOf(withId(in.sunilpaulmathew.sCommon.APKUtils.R.id.select_dialog_listview),
                        childAtPosition(
                                withId(in.sunilpaulmathew.sCommon.APKUtils.R.id.contentPanel),
                                0)))
                .atPosition(0);
        materialTextView2.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.contents),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.scroll_view),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("My Note"), closeSoftKeyboard());

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.save_button),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.contents), withText("My Note"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.appcompat.widget.LinearLayoutCompat.class))),
                        isDisplayed()));
        textView.check(matches(withText("My Note")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}

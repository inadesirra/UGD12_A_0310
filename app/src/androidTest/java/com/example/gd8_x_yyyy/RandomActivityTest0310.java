package com.example.gd8_x_yyyy;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class RandomActivityTest0310 {

    @Rule
    public ActivityTestRule<RandomActivity> mActivityTestRule = new ActivityTestRule<>(RandomActivity.class);

    @Test
    public void randomActivityTest0310() {
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.etEmail),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText.perform(replaceText("ina"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton2.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.etEmail), withText("Ina"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("inadesirra@gmail.Com"));

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.etEmail), withText("inadesirra@gmail.Com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText3.perform(closeSoftKeyboard());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton3.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.etEmail), withText("inadesirra@gmail.Com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText4.perform(replaceText("inadesirra@Gmail.Com"));

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.etEmail), withText("inadesirra@Gmail.Com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText5.perform(closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton4.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.etEmail), withText("inadesirra@Gmail.Com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText6.perform(replaceText("inadesirra@gmail.com"));

        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.etEmail), withText("inadesirra@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText7.perform(closeSoftKeyboard());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton5.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText10 = onView(
                allOf(withId(R.id.etPassword),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText10.perform(replaceText("ina"), closeSoftKeyboard());

        ViewInteraction textInputEditText11 = onView(
                allOf(withId(R.id.etPassword), withText("ina"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText11.perform(pressImeActionButton());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton6.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText12 = onView(
                allOf(withId(R.id.etPassword), withText("ina"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText12.perform(replaceText("ina_"));

        ViewInteraction textInputEditText13 = onView(
                allOf(withId(R.id.etPassword), withText("ina_"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText13.perform(closeSoftKeyboard());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton7.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText14 = onView(
                allOf(withId(R.id.etPassword), withText("ina_"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText14.perform(replaceText("ina123"));

        ViewInteraction textInputEditText15 = onView(
                allOf(withId(R.id.etPassword), withText("ina123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText15.perform(closeSoftKeyboard());

        ViewInteraction materialButton8 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton8.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText16 = onView(
                allOf(withId(R.id.etKotaAsal),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText16.perform(replaceText("Jawa"), closeSoftKeyboard());

        ViewInteraction materialButton9 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton9.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText17 = onView(
                allOf(withId(R.id.etKotaAsal), withText("Jawa"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText17.perform(replaceText("Jawa 123"));

        ViewInteraction textInputEditText18 = onView(
                allOf(withId(R.id.etKotaAsal), withText("Jawa 123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText18.perform(closeSoftKeyboard());

        ViewInteraction materialButton10 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton10.perform(click());
        onView(isRoot()).perform(waitFor(3000));

        ViewInteraction textInputEditText19 = onView(
                allOf(withId(R.id.etKotaAsal), withText("Jawa 123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText19.perform(replaceText("Jawa Tengah"));

        ViewInteraction textInputEditText20 = onView(
                allOf(withId(R.id.etKotaAsal), withText("Jawa Tengah"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText20.perform(closeSoftKeyboard());

        ViewInteraction materialButton11 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton11.perform(click());
        onView(isRoot()).perform(waitFor(3000));
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

    public static ViewAction waitFor(long delay) {
        return new ViewAction() {
            @Override public Matcher<View> getConstraints() {
                return isRoot();
            }
            @Override public String getDescription() {
                return "wait for " + delay + "milliseconds";
            }
            @Override public void perform(UiController uiController,
                                          View view) {
                uiController.loopMainThreadForAtLeast(delay);
            }
        };
    }
}

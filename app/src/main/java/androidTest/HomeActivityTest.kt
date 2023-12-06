package androidTest

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.ui.add.AddCourseActivity
import com.dicoding.courseschedule.ui.home.HomeActivity
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{

    @get:Rule
    val ruleHome = ActivityScenarioRule(HomeActivity::class.java)

    @Before
    fun setup(){
//        ActivityScenario.launch(HomeActivityTest::class.java)
    }

//    @Test
//    fun isAddCourseActivityDisplayed(){
//        onView(withId(R.id.fab)).perform(click())
//        intended(hasComponent(AddCourseActivity::class.java.name))
//    }
}
package com.example.proyecto

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import org.junit.Rule
import org.junit.Test

class AnimalGalleryTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun animalsLoadAndDetailScreenOpens() {
        composeTestRule.waitUntil(timeoutMillis = 3000) {
            composeTestRule.onAllNodesWithText("ADOPTA UN AMIGO").fetchSemanticsNodes().isNotEmpty()
        }

        composeTestRule.onAllNodes(hasClickAction()).onFirst().performClick()

        composeTestRule.waitUntil(timeoutMillis = 3000) {
            composeTestRule.onAllNodesWithText("Adoptar").fetchSemanticsNodes().isNotEmpty()
        }

        composeTestRule.onNodeWithText("Adoptar", ignoreCase = true).assertIsDisplayed()
    }
}


package com.example.proyecto

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import org.junit.Rule
import org.junit.Test

class ProfileScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun loginAndLogoutFlow_worksCorrectly() {

        composeTestRule.onNodeWithText("Perfil").performClick()

        composeTestRule.onNode(hasText("Usuario")).performTextInput("Abraham")

        composeTestRule.onNodeWithText("Entrar").performClick()

        composeTestRule.waitForIdle()
        composeTestRule.mainClock.advanceTimeBy(1500)

        composeTestRule.onNode(hasText("Hola, Abraham", substring = true)).assertIsDisplayed()

        composeTestRule.onNodeWithText("Cerrar sesión").performClick()

        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Iniciar sesión").assertIsDisplayed()
    }
}




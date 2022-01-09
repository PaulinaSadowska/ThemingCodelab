package com.paulinasadowska.themingcodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.paulinasadowska.themingcodelab.ui.theme.ThemingCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingCodelabTheme {
                Surface {
                    Home()
                }
            }
        }
    }
}

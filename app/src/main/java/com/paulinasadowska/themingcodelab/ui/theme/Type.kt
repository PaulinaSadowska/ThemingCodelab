package com.paulinasadowska.themingcodelab.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.paulinasadowska.themingcodelab.R

private val Montserrat = FontFamily(
        Font(R.font.montserrat_regular),
        Font(R.font.montserrat_medium, FontWeight.W500),
        Font(R.font.montserrat_semibold, FontWeight.W600)
)

private val Domine = FontFamily(
        Font(R.font.domine_regular),
        Font(R.font.domine_bold, FontWeight.Bold)
)

val Typography = Typography(
        h4 = TextStyle(
                fontFamily = Montserrat,
                fontSize = 30.sp,
                fontWeight = FontWeight.W600
        ),
        h5 = TextStyle(
                fontFamily = Montserrat,
                fontSize = 24.sp,
                fontWeight = FontWeight.W600
        ),
        h6 = TextStyle(
                fontFamily = Montserrat,
                fontSize = 20.sp,
                fontWeight = FontWeight.W600
        ),
        subtitle1 = TextStyle(
                fontFamily = Montserrat,
                fontSize = 16.sp,
                fontWeight = FontWeight.W600
        ),
        subtitle2 = TextStyle(
                fontFamily = Montserrat,
                fontSize = 14.sp,
                fontWeight = FontWeight.W500
        ),
        body1 = TextStyle(
                fontFamily = Domine,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
        ),
        body2 = TextStyle(
                fontFamily = Montserrat,
                fontSize = 14.sp
        ),
        button = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp
        ),
        caption = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        ),
        overline = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp
        )
)
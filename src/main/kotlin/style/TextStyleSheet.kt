package style

import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.px

object TextStyleSheet : StyleSheet(AppStyleSheet) {
    val title by style {
        fontSize(72.px)
        color(Color.white)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }

    val textWithFont by style {
        color(Color.white)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }

    val textLarge by style {
        fontSize(32.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val textMedium by style {
        color(Color.white)
        fontSize(24.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val textSmall by style {
        color(Color.white)
        fontSize(16.px)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val caption by style {
        color(Color.white)
        fontSize(12.px)
        property(
            "font-family",
            "-apple-system,Noto Sans JP, system-ui,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
}

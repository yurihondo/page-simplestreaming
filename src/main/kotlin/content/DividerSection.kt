package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun DividerSection() {
    Div(attrs = {
        style {
            padding(16.px)
        }
    }) {
        Divider()
    }
}

@Composable
private fun Divider(color: String = "#FFFFFFFF") {
    Div(attrs = {
        style {
            width(85.vw)
            border {
                height(1.px)
                width(85.vw)
                background(color)
            }
        }
    })
}

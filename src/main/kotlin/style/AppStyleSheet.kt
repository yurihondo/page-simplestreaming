package style

import org.jetbrains.compose.web.css.*

object AppStyleSheet : StyleSheet() {
    val centerContainer by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Normal)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Start)
        minWidth(100.vw)
        minHeight(100.vh)
    }

    val icon by style {
        maxWidth(120.px)
        maxHeight(120.px)
        borderRadius(50.pc)

        media(mediaMaxWidth(640.px)) {
            self style {
                marginLeft(0.px)
                marginBottom(16.px)
            }
        }
    }
}
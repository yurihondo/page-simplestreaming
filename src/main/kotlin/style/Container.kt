package style

import org.jetbrains.compose.web.css.*

object Container : StyleSheet(AppStyleSheet) {
    val mainContainer by style {
        flexDirection(FlexDirection.Row)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        backgroundColor(Color("#1C1C1C"))

        media(mediaMaxWidth(640.px)) {
            self style {
                flexDirection(FlexDirection.ColumnReverse)
                display(DisplayStyle.Flex)
                alignItems(AlignItems.Center)
            }
        }
    }

    val infoDescriptionContainer by style {
        alignItems(AlignItems.Center)
        // Medium
        fontSize(24.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                alignItems(AlignItems.Center)
                // Small
                fontSize(16.px)
            }
        }
    }

    val footerContainer by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        paddingBottom(16.px)
    }
}
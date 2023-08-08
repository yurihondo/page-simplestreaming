package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.Image
import style.AppStyleSheet
import style.Container.bioContainer
import style.Container.infoDescriptionContainer
import style.Container.infoNameContainer
import style.TextStyleSheet

@Composable
fun BioSection() {
    Div(attrs = {
        classes(bioContainer)
    }) {
        InfoSection()
    }
}

@Composable
private fun InfoSection() {
    Div(attrs = {
        style {
            flexDirection(FlexDirection.Column)
            display(DisplayStyle.Flex)
            marginLeft(16.px)
            marginTop(16.px)
        }
    }) {
        Div(attrs = {
            style {
                display(DisplayStyle.Flex)
                alignItems(AlignItems.Center)
                justifyContent(JustifyContent.Start)
            }
            classes(TextStyleSheet.textWithFont)
            classes(infoNameContainer)
        }) {
            Img(src = "icon.png", attrs = { classes(AppStyleSheet.icon) })
            Text("Simple Streaming")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
                marginLeft(124.px)
            }
            classes(TextStyleSheet.textWithFont)
            classes(infoDescriptionContainer)
        }) {
            Text("Simple YouTube Live Streaming Anyone Can Start")
        }
        Div(attrs = {
            style {
                marginTop(32.px)
                marginLeft(124.px)
            }
            classes(TextStyleSheet.textMedium)
            classes(infoDescriptionContainer)
        }) {
            Text("How to use")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
                marginLeft(140.px)
            }
            classes(TextStyleSheet.textSmall)
            classes(infoDescriptionContainer)
        }) {
            Text("TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...TBD...")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
                marginLeft(124.px)
            }
            classes(TextStyleSheet.textMedium)
            classes(infoDescriptionContainer)
        }) {
            Text("Terms of use")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
                marginLeft(140.px)
            }
            classes(TextStyleSheet.textSmall)
            classes(infoDescriptionContainer)
        }) {
            Text("This application does not capture device screens, allowing users to broadcast content at their discretion. However, users must exercise utmost caution when broadcasting sensitive or personal information. All users are expected to respect laws, copyrights, and other rights, and to avoid infringing upon them. Responsibility for actions and outcomes arising from using this application lies with the user. Furthermore, users are urged to refrain from broadcasting inappropriate content and are required to adhere to &lt;a href=\"https://www.youtube.com/howyoutubeworks/policies/community-guidelines/\"&gt;YouTube\\'s Community Guidelines&lt;/a&gt;.")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
                marginLeft(124.px)
            }
            classes(TextStyleSheet.textMedium)
            classes(infoDescriptionContainer)
        }) {
            Text("Privacy Policy")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
                marginLeft(140.px)
            }
            classes(TextStyleSheet.textSmall)
            classes(infoDescriptionContainer)
        }) {
            Text("Our application utilizes user YouTube™ account information for live streaming on YouTube™. In this process, we operate in compliance with Google\\'s &lt;a href=\"https://policies.google.com/terms?hl=en\"&gt;Terms of Service&lt;/a&gt; and &lt;a href=\"https://policies.google.com/privacy?hl=en-US\"&gt;Privacy Policy&lt;/a&gt;, making use of the YouTube™ API. Through this API, necessary information related to the user\\'s YouTube™ account is referenced and used. Stored information is managed appropriately and deleted when no longer needed. Rest assured, developers will not access stored data under any circumstances.")
        }
    }
}

@Composable
private fun Icon() {
    Img(src = "icon.png", attrs = { classes(AppStyleSheet.icon) })
}

package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.AppStyleSheet
import style.Container.footerContainer
import style.Container.infoDescriptionContainer
import style.Container.mainContainer
import style.TextStyleSheet

@Composable
fun MainContent() {
    Div(attrs = {
        classes(mainContainer)
    }) {
        Div(attrs = {
            style {
                flexDirection(FlexDirection.Column)
                display(DisplayStyle.Flex)
                marginLeft(16.px)
                marginTop(16.px)
            }
        }) {
            Header()
            Div(attrs = {
                style {
                    flexDirection(FlexDirection.Column)
                    display(DisplayStyle.Flex)
                    marginLeft(16.px)
                    marginTop(16.px)
                }
            }) {
                Summary()
                Download()
                HowToUse()
                TermsOfUse()
                PrivacyPolicy()
                Contact()
                Footer()
            }
        }
    }
}

@Composable
private fun Header() {
    Div(attrs = {
        style {
            display(DisplayStyle.Flex)
            alignItems(AlignItems.Center)
            justifyContent(JustifyContent.Start)
        }
        classes(TextStyleSheet.title)
    }) {
        Img(src = "icon.png", attrs = { classes(AppStyleSheet.icon) })
        Text("Simple Streaming")
    }
}

@Composable
private fun Summary() {
    Div(attrs = {
        classes(TextStyleSheet.textWithFont)
        classes(infoDescriptionContainer)
    }) {
        Text("The Android app for Simple YouTube Live Streaming Anyone Can Start")
    }
}

@Composable
private fun Download() {
    Div(attrs = {
        style {
            marginTop(32.px)
        }
        classes(TextStyleSheet.textMedium)
        classes(infoDescriptionContainer)
    }) {
        Text("Download app")
    }
    A(attrs = {
        style {
            paddingTop(8.px)
        }
        href("https://drive.google.com/file/d/1-AHiJ6xp0kraXD1EdF_7iN7eUv_ov-HV/view?usp=drive_link")
        target(ATarget.Blank)
    }) {
        Button(attrs = {
            style {
                border {
                    style = LineStyle.Solid
                    width = 1.px
                    color = Color.white
                }
                borderRadius(8.px)
                paddingLeft(16.px)
                paddingTop(8.px)
                paddingBottom(8.px)
                paddingRight(16.px)
                color(Color.white)
                backgroundColor(Color.darkgray)
            }
        }) {
            Text("Download Apk file")
        }
    }
    Pre(attrs = {
        style {
            marginTop(16.px)
        }
        classes(TextStyleSheet.textSmall)
        classes(infoDescriptionContainer)
    }) {
        Text("Please use ADB or similar tools to install the APK file on your own Android device.")
    }

}

@Composable
private fun HowToUse() {
    Div(attrs = {
        style {
            marginTop(32.px)
        }
        classes(TextStyleSheet.textMedium)
        classes(infoDescriptionContainer)
    }) {
        Text("How to use")
    }
    Pre(attrs = {
        style {
            marginTop(16.px)
            marginLeft(16.px)
        }
        classes(TextStyleSheet.textSmall)
        classes(infoDescriptionContainer)
    }) {
        Text("Using this app requires several steps. Please follow the guide below to operate.\n\n1. Agreeing to the Terms of Use\n- Before using the app, please carefully read and agree to the terms of use.\n\n2. Logging into Your YouTube Account\n- After agreeing to the terms, you'll need to log in to your YouTube account from the settings screen.\n- Please note that you cannot use the live streaming feature without logging in.\n\n3. Live Streaming to Your YouTube Channel (Text Only)\n- Once logged in, you can live stream to your YouTube channel using text only.\n- NOTE: Since live streaming may consume a large amount of data, we strongly recommend using this feature under a Wi-Fi environment.")
    }
}

@Composable
private fun TermsOfUse() {
    Div(attrs = {
        id("terms-of-use")

        style {
            marginTop(16.px)
        }
        classes(TextStyleSheet.textMedium)
        classes(infoDescriptionContainer)
    }) {
        Text("Terms of use")
    }
    Div(attrs = {
        style {
            marginTop(16.px)
            marginLeft(16.px)
            marginRight(16.px)
        }
        classes(TextStyleSheet.textSmall)
        classes(infoDescriptionContainer)
    }) {
        Text("This application does not capture device screens, allowing users to broadcast content at their discretion. However, users must exercise utmost caution when broadcasting sensitive or personal information. All users are expected to respect laws, copyrights, and other rights, and to avoid infringing upon them. Responsibility for actions and outcomes arising from using this application lies with the user. Furthermore, users are urged to refrain from broadcasting inappropriate content and are required to adhere to ")
        A(attrs = {
            href("https://www.youtube.com/intl/en_us/howyoutubeworks/policies/community-guidelines/")
        }) {
            Text("YouTube's Community Guidelines")
        }
        Text(".")
    }
}

@Composable
private fun PrivacyPolicy() {
    Div(attrs = {
        id("privacy-policy")

        style {
            marginTop(16.px)
        }
        classes(TextStyleSheet.textMedium)
        classes(infoDescriptionContainer)
    }) {
        Text("Privacy Policy")
    }
    Div(attrs = {
        style {
            marginTop(16.px)
            marginLeft(16.px)
            marginRight(16.px)
        }
        classes(TextStyleSheet.textSmall)
        classes(infoDescriptionContainer)
    }) {
        Text("Our application utilizes user YouTube™ account information for live streaming on YouTube™. In this process, we operate in compliance with Google's ")
        A(attrs = {
            href("https://policies.google.com/terms?hl=en")
        }) {
            Text("Terms of Service")
        }
        Text(" and ")
        A(attrs = {
            href("https://policies.google.com/privacy?hl=en-US")
        }) {
            Text("Privacy Policy")
        }
        Text(", making use of the YouTube™ API. Through this API, necessary information related to the user's YouTube™ account is referenced and used. Stored information is managed appropriately and deleted when no longer needed. Rest assured, developers will not access stored data under any circumstances.")
    }
}

@Composable
private fun Contact() {
    Div(attrs = {
        style {
            marginTop(16.px)
        }
        classes(TextStyleSheet.textMedium)
        classes(infoDescriptionContainer)
    }) {
        Text("Contact")
    }
    Pre(attrs = {
        style {
            marginTop(16.px)
            marginLeft(16.px)
        }
        classes(TextStyleSheet.textSmall)
        classes(infoDescriptionContainer)
    }) {
        Text("E-Mail: ")
        A(attrs = {
            href("mailto:yurihondo.dev@gmail.com")
        }) {
            Text("yurihondo.dev@gmail.com")
        }
        Text("\n")
        Text("Twitter: ")
        A(attrs = {
            href("https://twitter.com/yuyuyuyuyuri")
        }) {
            Text("yurihondo@yuyuyuyuyuri")
        }
    }
}

@Composable
private fun Footer() {
    Div(
        attrs = {
            classes(TextStyleSheet.caption)
            classes(footerContainer)
        }
    ) {
        DividerSection()
        Text("© 2023 · Powered by Jetpack Compose")
    }
}

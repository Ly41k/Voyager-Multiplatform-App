import androidx.compose.ui.window.ComposeUIViewController
import voyager.multiplatform.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

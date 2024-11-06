import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun App(){
    Row {
        NavigationRail{
            items.forEach{ item ->
                NavigationRailItem(
                    icon = {
                        Icon(
                            contentDescription = item.second.name,
                            imageVector = item.second
                        )
                    },
                    label = { Text(item.first) },
                    selected = false,
                    onClick = {}
                )
            }
        }
        Column(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
            message.forEach{ message ->
                Card(
                    modifier = Modifier.size(width = 400.dp, height = 100.dp).padding(top = 15.dp),
                    backgroundColor = Color(0xffc6b1c9),
                    contentColor = Color.White,
                    elevation = 10.dp
                ){
                    Row(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(resourcePath = message.image),
                            contentDescription = "Foto",
                            modifier = Modifier.clip(CircleShape)
                        )
                        Column(modifier = Modifier.padding(start = 10.dp)) {
                            Text(message.name)
                            Text(modifier = Modifier.padding(top = 5.dp), text = message.message)
                        }
                    }
                }
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tarea 1",
        state = rememberWindowState()
    ){
        App()
    }
}
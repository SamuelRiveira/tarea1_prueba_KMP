import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
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
                    modifier = Modifier.size(width = 300.dp, height = 100.dp).padding(top = 15.dp),
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
        Column(modifier = Modifier.padding(10.dp).fillMaxSize()) {
            Text(
                text = "Form",
                modifier = Modifier
                    .padding(top = 10.dp),
                fontSize = TextUnit(value = 20f, type = TextUnitType.Sp)
            )
            OutlinedTextField(
                value = "John Smith",
                onValueChange = {},
                placeholder = { Text("Type Name") },
                label = { Text("Name") },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth()
            )
            OutlinedTextField(
                value = body,
                onValueChange = {},
                placeholder = { Text("Type Body") },
                label = { Text("Text") },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .weight(1f)
                    .fillMaxWidth()
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xffc6b1c9)
                )
            ){
                Text(
                    text = "Send",
                    color = Color.White
                )
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tarea 1",
        state = rememberWindowState(width = 1000.dp, height = 600.dp)
    ){
        App()
    }
}
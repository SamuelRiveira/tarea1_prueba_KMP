import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

data class Message(val name: String, val message: String, val image: String)
private val body = "awawghhtjyjy sr ar aigiawihaowf a iahwi aofaihdahwfio haifah iahwf"

val message = listOf<Message>(
    Message("Persona1 Apellido1", body, "img1.jpeg"),
    Message("Persona2 Apellido2", body, "img2.jpeg"),
    Message("Persona3 Apellido3", body, "img3.jpeg")
)

val items = listOf(
    "Home" to Icons.Default.Home,
    "Search" to Icons.Default.Search,
    "Setting" to Icons.Default.Settings
)
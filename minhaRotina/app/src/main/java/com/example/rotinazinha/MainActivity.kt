package com.example.rotinazinha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rotinazinha.ui.theme.RotinazinhaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RotinazinhaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RoutineContent()
                }
            }
        }
    }
}

@Composable
fun RoutineContent() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "primeira atividade Kotlin",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "rotina",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )

        // Add Image here
        Image(
            painter = painterResource(id = R.drawable.perfil), // Replace with your image resource name
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Parte da manhã:",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Acordo com muita força de vontade às 6:00, faço meu café da manhã e me arrumo pra faculdade enquanto escuto música ou um podcast até as 7:00 quando saio para a faculdade que termina às 13:00 horas.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Parte da tarde:",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "De 13:00 começo a fazer meu almoço quase desmaiando de fome e quando finalmente almoço vou tomar banho e limpar o banheiro para tirar meu pequeno cochilo da beleza até as 15:00, quando acordo começo a estudar até umas 18:00.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Parte da noite:",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Começo a noite fazendo a janta e lavando os pratos para de 19:00 estar no inglês ou terminar de estudar dependendo do dia. Às 22 horas o inglês acaba e eu costumo ver se tem alguma coisa pra arrumar na casa pra enfim dormir.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Citação do dia:",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "É difícil não odiar. Pessoas, coisas, instituições. Quando quebram seu espírito e têm prazer em te ver sangrar, ódio é o único sentimento que faz sentido.",
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "— Jax Teller (Sons of Anarchy)",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RoutineContentPreview() {
    RotinazinhaTheme {
        RoutineContent()
    }
}

package com.david.focusquest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.david.focusquest.ui.theme.FocusQuestTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            FocusQuestTheme {

                PantallaPrincipal()

            }

        }
    }
}

@Composable
fun PantallaPrincipal() {

    var experiencia by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "FocusQuest",
            style = MaterialTheme.typography.headlineLarge
        )

        val nivel = (experiencia / 100) + 1

        Text(
            text = "Nivel $nivel",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Experiencia: $experiencia XP"
        )

        Button(
            onClick = {
                experiencia += 10
            }
        ) {

            Text("Completar tarea")

        }
    }
}
package com.david.focusquest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.david.focusquest.ui.listaTareas
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

    val tareas = remember {
        mutableStateListOf(*listaTareas.toTypedArray())
    }

    val nivel = (experiencia / 100) + 1

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "FocusQuest",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "Nivel $nivel",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Experiencia: $experiencia XP"
        )

        Text(
            text = "Tareas",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(
                top = 30.dp,
                bottom = 10.dp
            )
        )

        LazyColumn {

            itemsIndexed(tareas) { index, tarea ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {

                        Text(
                            text = tarea.nombre,
                            style = MaterialTheme.typography.titleMedium
                        )

                        Text(
                            text = "+${tarea.experiencia} XP"
                        )

                        Button(
                            onClick = {

                                experiencia += tarea.experiencia

                                tareas[index] = tarea.copy(
                                    completada = true
                                )
                            },

                            enabled = !tarea.completada
                        ) {

                            if (tarea.completada) {
                                Text("Completada")
                            } else {
                                Text("Completar")
                            }
                        }
                    }
                }
            }
        }
    }
}
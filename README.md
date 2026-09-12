#  FocusQuest

FocusQuest es una aplicación Android de gestión de tareas gamificada,
desarrollada con Kotlin y Jetpack Compose.

La aplicación permite completar tareas para obtener experiencia (XP),
subir de nivel y llevar un seguimiento del progreso personal.

##  Estado actual

### v0.1.0

- [x] Proyecto Android creado
- [x] Interfaz inicial con Jetpack Compose
- [x] Sistema de experiencia
- [x] Sistema de niveles
- [x] Clase `Tarea`
- [x] Lista inicial de tareas
- [x] APK funcional en dispositivo Android

## Tecnologías

- Kotlin
- Android Studio
- Jetpack Compose
- Material 3
- Gradle
- Git
- GitHub

## Funcionamiento

Cada tarea entrega una cantidad determinada de experiencia.

Ejemplo:

| Tarea | Recompensa |
|---|---:|
| Estudiar Kotlin | 30 XP |
| Entrenar | 20 XP |
| Leer 30 minutos | 15 XP |

Cada 100 XP el usuario aumenta de nivel.

## Roadmap

### v0.2
- [ ] Mostrar tareas dinámicamente
- [ ] Completar tareas
- [ ] Evitar completar una tarea varias veces

### v0.3
- [ ] Crear tareas desde la aplicación
- [ ] Eliminar tareas
- [ ] Editar tareas

### v0.4
- [ ] Persistencia de datos
- [ ] Room Database

### v0.5
- [ ] Estadísticas
- [ ] Historial
- [ ] Mejoras visuales

### v1.0
- [ ] Primera versión estable de FocusQuest

## Estrategia de ramas

- `main`: versiones estables
- `develop`: integración de funcionalidades
- `feature/*`: desarrollo de nuevas características

## APK

El proyecto puede compilarse utilizando Gradle:

```bash
./gradlew assembleDebug
# Gestor Personal de Tareas

## 1. Nombre y descripción de la aplicación
Aplicación Android desarrollada para la asignatura de Programación Multimedia y Dispositivos Móviles (PMM). El objetivo es permitir al usuario organizar y gestionar tareas personales, académicas o profesionales, con persistencia real, preferencias y consultas a una API externa.

## 2. Funcionalidades implementadas
*(Ir actualizando a medida que avance el proyecto)*
- [ ] Listado de tareas con LazyColumn.
- [ ] Creación, edición y eliminación de tareas con validación.
- [ ] Persistencia con base de datos Room.
- [ ] Filtro de "Mostrar solo pendientes" con DataStore.
- [ ] Consulta a la API de JSONPlaceholder con Retrofit.
- [ ] Compartir tareas mediante Intent ACTION_SEND.

## 3. Organización básica del proyecto
El código está estructurado separando responsabilidades (Modelo, Interfaz, Almacenamiento, Preferencias y Red):
- `model`: Clases de datos (Tarea, Prioridad) y validadores.
- `data.local`: Entidad, DAO y base de datos Room.
- `data.preferences`: Gestión de DataStore.
- `data.remote`: Cliente Retrofit y modelos de la API.
- `ui`: Pantallas y componentes de Jetpack Compose.

## 4. Bibliotecas utilizadas
- **Jetpack Compose:** Para la interfaz gráfica declarativa.
- **Room:** Para la base de datos local SQLite.
- **DataStore:** Para guardar las preferencias de usuario (filtro).
- **Retrofit:** Para las peticiones a la API REST.
- **Coroutines:** Para las operaciones asíncronas.

## 5. Instrucciones para ejecutar la aplicación
1. Abrir el proyecto en Android Studio (versión Quail 4 o superior).
2. Esperar a que Gradle sincronice las dependencias.
3. Seleccionar un emulador o dispositivo físico (API 24 o superior).
4. Pulsar el botón "Run" (triángulo verde) para compilar e instalar la app.

## 6. Configuraciones de los dos emuladores utilizados
*(Rellenar al final de la práctica)*
- **Emulador 1:** [Ejemplo: Teléfono compacto - Pixel 4, API 30]
- **Emulador 2:** [Ejemplo: Pantalla grande - Pixel Tablet, API 34]

## 7. Tabla de pruebas realizadas y resultados obtenidos
*(Rellenar al final con los resultados reales)*

| Nº | Prueba | Resultado esperado | Resultado obtenido |
| :--- | :--- | :--- | :--- |
| 1 | Crear una tarea válida | Se guarda y aparece en la lista | Pendiente |
| 2 | Intentar guardar un título vacío | Se muestra un error y no se crea | Pendiente |
| ... | ... | ... | ... |

## 8. Enlace al chat de IA usado durante el desarrollo
*[Pegar aquí el enlace a la conversación de Claude]*

## 9. Incidencias conocidas o funcionalidades no completadas
- Ninguna por el momento. El proyecto se encuentra en fase de desarrollo.

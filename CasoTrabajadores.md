
# Sistema de Gestión de Trabajadores utilizando MVC

En este sistema, gestionamos un arreglo de trabajadores utilizando el patrón MVC (Modelo-Vista-Controlador). A continuación se describen las clases y sus métodos:

## Modelo
**Clase Trabajador:**
- **Atributos:**
  - `nombre`: String
  - `puesto`: String
  - `sueldo`: double
- **Constructores:**
  - `Trabajador(String nombre, String puesto, double sueldo)`: Inicializa los atributos del trabajador.
- **Métodos:**
  - `setNombre(String nombre)`: Establece el nombre del trabajador.
  - `setPuesto(String puesto)`: Establece el puesto del trabajador.
  - `setSueldo(double sueldo)`: Establece el sueldo del trabajador. Valida que no sea negativo ni cero, usando propagación de errores.
  - `getNombre()`: Retorna el nombre del trabajador.
  - `getPuesto()`: Retorna el puesto del trabajador.
  - `getSueldo()`: Retorna el sueldo del trabajador.
  - `toString()`: Sobrescribe el método `toString` para retornar una representación en cadena del trabajador.
  - `static int validaNumero(String input)`: Valida que la entrada sea un número entero, usando try-catch y propagación de errores para manejar entradas incorrectas.

**Clase GestionTrabajadores:**
- **Atributos:**
  - `trabajadores`: Trabajador[]
  - `indiceActual`: int
- **Constructores:**
  - `GestionTrabajadores(int capacidad)`: Inicializa el arreglo de trabajadores con la capacidad dada y el índice actual a cero.
- **Métodos:**
  - `agregarTrabajador(Trabajador trabajador)`: Agrega un trabajador al arreglo.
  - `obtenerTrabajadores()`: Retorna el arreglo de trabajadores.

## Vista
**Clase TrabajadorVista:**
- **Métodos:**
  - `mostrarTrabajador(Trabajador trabajador)`: Muestra la información de un trabajador.
  - `mostrarTrabajadores(Trabajador[] trabajadores)`: Muestra la información de todos los trabajadores.

## Controlador
**Clase TrabajadorControlador:**
- **Atributos:**
  - `modelo`: GestionTrabajadores
  - `vista`: TrabajadorVista
- **Constructores:**
  - `TrabajadorControlador(GestionTrabajadores modelo, TrabajadorVista vista)`: Inicializa el controlador con el modelo y la vista.
- **Métodos:**
  - `agregarTrabajador(String nombre, String puesto, double sueldo)`: Agrega un trabajador validando los datos.
  - `mostrarTrabajadores()`: Muestra todos los trabajadores usando la vista.
  - `menu()`: Muestra el menú de opciones para la gestión de trabajadores, manejando las validaciones y errores adecuadamente con try-catch y propagación de errores.

Este sistema permite gestionar trabajadores de manera efectiva, validando entradas y asegurando la integridad de los datos a través del uso del patrón MVC.

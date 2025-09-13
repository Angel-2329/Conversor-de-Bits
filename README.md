# Conversor-de-Bits

## 📝 Descripción
El proyecto **Convertidor de Bits y Bytes** es una aplicación desarrollada en **Java Swing** que permite realizar conversiones entre distintas unidades de almacenamiento digital:  
- Bits  
- Bytes  
- KiloBytes  
- MegaBytes  
- GigaBytes  
- TeraBytes  

El usuario selecciona una **unidad base**, una **unidad de conversión**, introduce un valor y el sistema calcula el equivalente.
Se ocupa una equivalencia de 1024 bits.

---

## 🎯 Objetivos
- Implementar un sistema de conversión de unidades digitales.  
- Desarrollar una interfaz gráfica amigable con **Java Swing**.  
- Aplicar el uso de **eventos** y **grupos de botones** (`ButtonGroup`) para selección única.  
- Evitar que el usuario seleccione la misma unidad como base y como conversión.  

---

## ⚙️ Funcionalidades
1. **Selección de unidad base** (Bits, Bytes, KB, MB, GB, TB).  
2. **Selección de unidad de conversión** (Bits, Bytes, KB, MB, GB, TB).  
3. **Entrada de valor numérico** a convertir.  
4. **Botón "Calcular"**: realiza la conversión y muestra el resultado.  
5. **Botón "Borrar"**: limpia campos y reinicia las opciones.  
6. Sistema de bloqueo: si se selecciona una unidad base, no se puede elegir la misma como unidad de conversión (y viceversa).  

---

## 🖥️ Interfaz gráfica
La interfaz se compone de:  
- Panel principal con título **“Convertidor de Bits”**.  
- Dos columnas de **RadioButtons**:  
  - Columna izquierda → Unidad base.  
  - Columna derecha → Unidad a convertir.  
- Campo de texto para el valor a convertir.  
- Campo de texto para el resultado.  
- Botones **Calcular** y **Borrar**.  

---

## 📂 Organización del código
- **ConvertidorBits.java**  
  - Contiene la interfaz gráfica y los eventos de los botones.  
  - Maneja la lógica de selección de unidades.  
- **ConvertidorBytes.java** *(clase auxiliar)*  
  - Realiza las conversiones matemáticas entre unidades.  

---
 
## 📌 Explicación de las Clases

### 🔹 Clase `ConvertidorBits`
Esta clase representa la **interfaz gráfica del convertidor**.  
Se encarga de la interacción con el usuario y de la comunicación con la clase auxiliar `ConvertidorBytes`.  

**Responsabilidades principales:**
- Crear la interfaz gráfica con **Java Swing**.  
- Agrupar botones de selección (`ButtonGroup`) para:
  - **Unidad base** (Bits, Bytes, KB, MB, GB, TB).  
  - **Unidad de conversión** (Bits, Bytes, KB, MB, GB, TB).  
- Asignar un **valor numérico** a cada `JRadioButton` usando `putClientProperty`.  
- Evitar que el usuario seleccione la misma unidad en ambos lados (deshabilita la opción correspondiente).  
- Obtener las opciones seleccionadas mediante los métodos:  
  - `getUnidadBaseSeleccionada()` → retorna un número (1–6) según la unidad base elegida.  
  - `getUnidadConvertirSeleccionada()` → retorna un número (1–6) según la unidad de conversión elegida.  
- Gestionar botones:
  - **Calcular:**  
    Convierte la unidad base a bytes con `convertirABytes()` y luego pasa el resultado a la unidad deseada con `convertirDesdeBytes()`.  
  - **Borrar:**  
    Limpia los campos de texto y reinicia la selección de unidades.  

---

### 🔹 Clase `ConvertidorBytes`
Esta clase contiene la **lógica de conversión** entre las distintas unidades.  
Se utiliza como clase auxiliar por `ConvertidorBits`.  

**Métodos principales:**
- `convertirABytes(int opcion, double valor)`  
  Convierte el valor dado en cualquier unidad a **Bytes**.  
  - Bits → Bytes (`valor / 8`)  
  - Bytes → Bytes (`valor`)  
  - KB → Bytes (`valor * 1024`)  
  - MB → Bytes (`valor * 1024 * 1024`)  
  - GB → Bytes (`valor * 1024 * 1024 * 1024`)  
  - TB → Bytes (`valor * 1024 * 1024 * 1024 * 1024`)  

- `convertirDesdeBytes(int opcion, double bytes)`  
  Convierte un valor en **Bytes** hacia la unidad seleccionada.  
  - Bytes → Bits (`bytes * 8`)  
  - Bytes → Bytes (`bytes`)  
  - Bytes → KB (`bytes / 1024`)  
  - Bytes → MB (`bytes / (1024 * 1024)`)  
  - Bytes → GB (`bytes / (1024 * 1024 * 1024)`)  
  - Bytes → TB (`bytes / (1024 * 1024 * 1024 * 1024)`)  

---

### 🧩 Relación entre clases
- `ConvertidorBits` = **Vista y Controlador** (interfaz gráfica + gestión de eventos).  
- `ConvertidorBytes` = **Modelo** (lógica de negocio para convertir unidades).  

El diseño sigue el principio de **separación de responsabilidades**:  
- La interfaz solo muestra y gestiona opciones.  
- La clase auxiliar hace los cálculos matemáticos.  


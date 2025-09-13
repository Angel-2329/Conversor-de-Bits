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
 


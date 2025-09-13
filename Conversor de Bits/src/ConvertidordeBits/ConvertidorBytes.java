/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidordeBits;

/**
 *
 * @author megan
 */
public class ConvertidorBytes
{
    public ConvertidorBytes ()
    {
        
    }
    
    public double convertirABytes(int opcion, double valor) 
    {
        switch (opcion) 
        {
            case 1: // Bits
                return valor / 8;
            case 2: // Bytes
                return valor;
            case 3: // KB
                return valor * 1024;
            case 4: // MB
                return valor * 1024 * 1024;
            case 5: // GB
                return valor * 1024 * 1024 * 1024;
            case 6: // TB
                return valor * 1024 * 1024 * 1024 * 1024;
            default:
                throw new IllegalArgumentException("Opción inválida.");
        }
    }
    
    public double convertirDesdeBytes(int opcion, double bytes) 
    {
        switch (opcion) 
        {
            case 1: // Bits
                return bytes * 8;
            case 2: // Bytes
                return bytes;
            case 3: // KB
                return bytes / 1024;
            case 4: // MB
                return bytes / (1024 * 1024);
            case 5: // GB
                return bytes / (1024 * 1024 * 1024);
            case 6: // TB
                return bytes / (1024 * 1024 * 1024 * 1024);
            default:
                throw new IllegalArgumentException("Opción inválida.");
        }
    }
}

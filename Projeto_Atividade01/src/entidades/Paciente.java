/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author puc
 */
public class Paciente {
    //Atributos
    public String nomeCompleto = "";
    public int peso = 0;
    public float altura = 0;
    public String sexo = "";
    
//Metodos
    public float calcularIMC(){
    return peso/((altura/100) * (altura/100));
    
    }
    
}

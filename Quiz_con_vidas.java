package quiz_con_vidas;

import java.util.Scanner;

public class Quiz_con_vidas {
//10 preguntas vida:120 daño por error:30 cada acierto suma 5 de vida, sin pasarse

    public static void main(String[] args) {
        String resultado[]={"Excelente","Aprovado","Necesita Repasar"};
        int resultadoint;
        String opcion = "";
        Scanner sc =new Scanner(System.in);
        String respuestas[][]={
            {"Cual es el valor por defecto de una variable de tipo boolean en Java?","false","null","true","void","a"},
            {"Cual es la diferencia entre == y .equals() en Java?","son lo mismo","== es para numeros y .equals() para texto","solo comparan texto","Solo comparan numeros","b"},
            {"Como se declara una variable privada en una clase?","public","void","int","private","d"},
            {"Que tipo de dato corresponde a las variables boolean?","numerica","verdadero o falso","decimal","imagen","b"},
            {"Que visibilidad tiene un miembro de una clase que se declara sin ningun modificador de acceso explicito?","Solo se ve con los del mismo paquete","Todos lo ven","No se puede ver","Nada","a"},
            {"Que caracteriza a un metodo o variable declarado como static en una clase Java?","Que siempre cambia","No existe","Pertenece a la clase en su conjunto y es compartido por todas las instancias","No se diverencia en nada","c"},
            {"Cual es la forma correcta de declarar y asignar un valor a una variable de tipo entero en Java?","int numero = \"10\";","integer numero = 10;","int numero = 10;","num numero = 10;","c"},
            {"Que palabra clave se utiliza en la firma de un metodo para indicar que este NO devuelve ningun valor?","int","void","empy","return","b"},
            {"Cual de las siguientes palabras clave convierte una variable en una constante?","final","private","constant","void","a"},
            {"Como se llama el metodo especial que sirve como punto de entrada principal para ejecutar cualquier programa en Java?","first","void","mian","princs","c"}
        };
        int aciertos=0;
        int errores[] ={0,0,0,0,0,0,0,0,0,0,0};
        int vida=120;
        int contestadas=0;
        
        System.out.println("*****************************************");
        System.out.println("        Bienvenido a nuestro Quiz");
        System.out.println();
        
        for(int k=0; k<10; k++){
            System.out.println("Pregunta " + (k+1) + ": " + respuestas[k][0]);
            for(int i=1; i<=4; i++){
                System.out.println((char)('a'+i-1) + ")" + respuestas[k][i]);
            }
            opcion = sc.nextLine();
            contestadas++;
            if(opcion.equalsIgnoreCase(respuestas[k][5])){
                System.out.println("Correcto");
                System.out.println();
                System.out.println();
                aciertos++;
                vida+=5;
                if(vida>120){
                    vida=120;
                }
            }else{
                System.out.println("Incorrecto");
                vida-=30;
                errores[0]++;
                errores[k+1]=1;
                System.out.println();
                System.out.println();
            
            if(vida<=0){
                System.out.println("GAME OVER");
                break;
            }
        }}
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        if(aciertos>=9){
            resultadoint=0;
        }else if(aciertos>=7){
            resultadoint=1;
        }else{
            resultadoint=2;
        }
        
        System.out.println("============ RESUMEN ============");
        System.out.printf("%-20s %4s%n" ,"Preguntas contestadas: ", contestadas+" de 10");
        System.out.printf("%-20s %4s%n" ,"Aciertos: ", aciertos);
        System.out.printf("%-20s %4s%n" ,"Errores: ", errores[0]);
        System.out.printf("%-20s %4s%n" ,"Porcentaje", aciertos+"0.0%");
        System.out.printf("%-20s %4s%n" ,"Vida final: ", vida);
        System.out.printf("%-20s %4s%n" ,"Resultado: ", resultado[resultadoint]);
        System.out.println("Preguntas a repasar:");
        
        for(int k=1; k<=10; k++){
            if(errores[k]==1){
                System.out.println(respuestas[k-1][0] + " (" + respuestas[k-1][5] +")" );
            }
        }
        if(errores[0]==0){
            System.out.println("Felicidades ninguna pregunta a repasar");
        }
        
        System.out.println("=================================");
        
    }
    
}

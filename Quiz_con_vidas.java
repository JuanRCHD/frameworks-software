
package quiz_con_vidas;

import java.util.Scanner;

public class Quiz_con_vidas {
//10 preguntas vida:120 daño por error:30 cada acierto suma 5 de vida, sin pasarse

    public static void main(String[] args) {
        String resultado[]={"Excelente","Aprovado","Necesita Repasar"};
        int resultadoint;
        String opcion = "";
        Scanner sc =new Scanner(System.in);
        String respuestasCorrectas[]={"a","b","d","b","a","c","c","b","a","c"};
        String respuestas[][]={
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""}
        };
        String preguntas[]={"","","","","","","","","",""};
        int aciertos=0;
        int errores =0;
        float porcentaje;
        int vida=120;
        int contestadas=0;
        
        System.out.println("*****************************************");
        System.out.println("        Bienvenido a nuestro Quiz");
        System.out.println();
        
        for(int k=0; k<10; k++){
            System.out.println("Pregunta " + (k+1) + ": " + preguntas[k]);
            for(int i=0; i<4; i++){
                System.out.println((char)('a'+i) + ")" + respuestas[k][i]);
            }
            opcion = sc.nextLine();
            contestadas++;
            if(opcion.equalsIgnoreCase(respuestasCorrectas[k])){
                System.out.println("Correcto");
                aciertos++;
                vida+=5;
                if(vida>120){
                    vida=120;
                }
            }else{
                System.out.println("Incorrecto");
                vida-=30;
                errores++;
            
            if(vida<=0){
                System.out.println("GAME OVER");
                break;
            }
        }}
        
        if(aciertos>=9){
            resultadoint=0;
        }else if(aciertos>=7){
            resultadoint=1;
        }else{
            resultadoint=2;
        }
        
        System.out.println("============ RESUMEN ============");
        System.out.printf("%-23s %4s%n" ,"Preguntas contestadas: ", contestadas+" de 10");
        System.out.printf("%-23s %4s%n" ,"Aciertos: ", aciertos);
        System.out.printf("%-23s %4s%n" ,"Errores: ", errores);
        System.out.printf("%-23s %4s%n" ,"Porcentaje", aciertos+"0.0%");
        System.out.printf("%-23s %4s%n" ,"Vida final: ", vida);
        System.out.printf("%-23s %4s%n" ,"Resultado: ", resultado[resultadoint]);
        
        
    }
    
}

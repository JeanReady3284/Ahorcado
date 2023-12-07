
import  java.util.Scanner;

public class ahorcado {

   
    public static void main(String[] args) {
       int numero,vidas=3;
       char letra;
       boolean aux=false;
        String palabras[]= new String[24];
        palabras[1]="desoxirribonucleico"; palabras[2]="aragon"; palabras[3]="musica"; palabras[4]="casa"; palabras[5]="carro";
        palabras[6]="telefono"; palabras[7]="amor"; palabras[8]="libreta"; palabras[9]="niño"; palabras[10]="vida";
        palabras[11]="muerte"; palabras[12]="lapiz"; palabras[13]="bolsa"; palabras[14]="mente"; palabras[15]="numero";
        palabras[16]="dinero"; palabras[17]="tienda"; palabras[18]="crema"; palabras[19]="pizza"; palabras[20]="carne";
        palabras[21]="teclado"; palabras[22]="guitarra"; palabras[23]="taza";
        
        Scanner entrada= new Scanner(System.in);
                
        System.out.println("Juguemos colgado. Tienes hasta 3 errores:  ");
        System.out.println("Ingrese un numero del 1 al 23: ");    //Ingresa numero
        numero=entrada.nextInt();
        
        String palabraOculta= palabras[numero];  //Guardo la palabra escogida
        
        int letraspalabra=palabraOculta.length();  
        
        char[] encriptar= new char [letraspalabra];
        
        for(int i=0; i<encriptar.length; i++){  //Oculto la palabra con asteriscos
            System.out.print("*");
            encriptar[i]='*';
        }
        
        
        do{
        System.out.println("\nLa letra que propones es: ");  //Propone una letra
        letra=entrada.next().charAt(0);
        
        boolean acierto=false;        //Esto es para ver si acierta o no
        for(int i=0; i<letraspalabra; i++){
            if(letra==palabraOculta.charAt(i)){
                encriptar[i]=letra;
                acierto=true;
            }   
            
        }
        if(acierto==false){      //Si no acierta
            vidas=vidas-1;
            
            System.out.println("La palabra es: ");
            System.out.println(encriptar);
            if(vidas==0){
            System.out.println("No ha salvado al condenado, ha sido colgado"); //PIERDE
            System.out.println("La palabra era: "+palabraOculta);
            aux=true;
            }
            else{
            System.out.println("Error. Te quedan " +vidas+ " intentos"); 
            }
            
        }
        else{     //Si si acierta
            int conta=0;
            for(int j=0; j<encriptar.length; j++){
               if(encriptar[j]=='*'){
                   conta++;
               }
            }
                   if(conta>0){ //Aun hay asteriscos
                       System.out.println("La palabra es: ");
                       System.out.println(encriptar);
                   }
               
                else{  //Ya no hay asteriscos, lo salva
                   System.out.println("Ha salvado al condenado");  //GANA
                   System.out.println("La palabra es: "+palabraOculta);
                   aux=true;
               }
           
            }
     
        }while(aux==false);
        
       
        
    }
    
}

import java.beans.beancontext.BeanContext;

class Main {
    public static void main(String[] args) {
        int numeroIf=0,numeroWhile=0,numeroFor=0;
        String estacion="Invierno";

        if(numeroIf>0){
            System.out.println("El número es positivo");
        }
        else if(numeroIf<0){
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El número es cero");
        }

        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        while(numeroWhile<4);

        for(numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        
        switch(estacion.toLowerCase()){
            case "verano": System.out.println("Es verano");
            break;
            case "invierno": System.out.println("Es invierno");
            break;
            case "otoño": System.out.println("Es otoño");
            break;
            case "primavera": System.out.println("Es primavera");
            break;
            default: System.out.println("Ingrese una estación válida");
        }

    }
}

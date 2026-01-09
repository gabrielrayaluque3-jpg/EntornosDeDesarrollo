public class calculadora {
    double suma(double a, double b) {
        return a + b;
    }

    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplica(double a, double b) {
        return (a * b); //Quito la funcion Math.abs para que devuelva numeros negativos
    }

    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    int factorial (int numero) {
        int resultado = 1;
        for (int i=1; i <= numero; i++) {  //Iniciamos la i=1 pq si es 0 todos los factoriales es = 0
            resultado *= i;
        }
        return resultado;
    }

    boolean esPrimo (int numero) {
        boolean esNumeroPrimo = true;
        if(numero==1||numero==2){
            esNumeroPrimo=true;
        }else{
            for (int i = 2; i < numero && esNumeroPrimo; i++) {
                if (numero % i == 0) {
                    esNumeroPrimo = false;
                }
            }
        }
        return esNumeroPrimo;
    }

    public double raizCuadrada(double radicando) throws Exception {
        double resultado = 0;
        if (radicando < 0) {
            throw new Exception("El radicando no puede ser negativo");
        }else{
            resultado=Math.sqrt(radicando);
        }
        return resultado;
    }

}
class Fatorial{
    public static void main(String[] args){

        long resultadoTotal = 1;
        for(int n = 1; n < 20; n++){
            resultadoTotal += resultadoTotal*n;
        }
        System.out.println(resultadoTotal);
        //3628800
    }
}
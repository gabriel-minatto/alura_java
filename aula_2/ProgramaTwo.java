class ProgramaTwo{
    public static void main(String[] args){
        int numeroPequeno = 32000;
        long numeroGrande = 99999999999999L; // L no final para especificar q eh um long

        float outroPi = 3.14f;
        double pi = 3.14;

        int numero = 10;
        long copiaDeNumero = numero;

        long numero2 = 314;
        int copiaDeNumero2 = (int)numero2; //casting

        System.out.println(copiaDeNumero2);

        /*
        implicit casting
        byte -> short -> int -> long -> float -> double;
        */
        byte num = 0b00000010;
        short numShort = num;
        int numInt = numShort;
        long numLong = numInt;
        float numFloat = numLong;
        double numDouble = numFloat;
        System.out.println(numDouble);
    }
}
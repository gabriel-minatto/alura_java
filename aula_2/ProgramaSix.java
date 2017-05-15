class ProgramaSix{
    public static void main(String[] args){

    int x = 13;

    while (x != 1) {
       System.out.print(x + ">");
        if(x % 2 == 0){
            x = x / 2;
            continue;
        }
        x = ((3 * x) + 1);
     }
     System.out.println(x);
     //13 > 40 > 20 > 10 > 5 > 16 > 8 > 4 > 2 > 1

    }
}
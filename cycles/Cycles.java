class Cycles{
    public static void main(String args[]){
       normaCycles();
       reverseCycles();
       fibonacci();
    }

    public static void normaCycles(){
        System.out.println("Normal Cycles");
        String putString = "";
        for(int n =1; n<=10;n++){
            putString = putString + " " + n;
        };
        System.out.println(putString);        
        System.out.println("----------------------");
    };

    public static void reverseCycles(){
        int normaCycles = 1,
            reverseCycles = 99;
        String putString = "";
        System.out.println("Reverse Cycles");
        while(normaCycles < 6 && reverseCycles > 94){
           putString = putString + " " + normaCycles +  " "  + reverseCycles ;
            normaCycles++;
            reverseCycles--;
        };
        System.out.println(putString);
        System.out.println("----------------------");
    };

    public static void fibonacci(){
        int numberInit = 0,
            alterNumber = 1000, 
            cacheNumber;
        String putString = "";
        
        System.out.println("Fibonacci sequence");
        while(numberInit < 100){
            if(numberInit == 0) {
                putString = putString + " " + numberInit + " ";
                alterNumber=0;
                numberInit++;
                continue;
            };
            if(numberInit == 1 && alterNumber == 0){
                putString = putString + " " + numberInit + " ";
                alterNumber = numberInit;
                continue;
            }
            if(alterNumber > 0 ){
                cacheNumber = numberInit;
                putString = putString + " " + numberInit + " ";
                numberInit = alterNumber + numberInit;
                alterNumber = cacheNumber;
            } 
        }
        System.out.println(putString);
        System.out.println("----------------------");    
    };
}
package array;

class ListNumber{
    public static void main(String args[]){
        int[] listNumber = new int[5];
       
        for(int n = 0 ; n < 5 ; n++) listNumber[n]= n;

        for(int i = 0; i < listNumber.length ; i++) System.out.println(listNumber[i]);

    }

}
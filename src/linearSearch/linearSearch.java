package linearSearch;

public class linearSearch {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,55,66,76};

        int index = linearSearch(array, 69);
        if(index != -1){
            System.out.println("Your Number Index Is " + index);
        }
        else{
            System.out.println("This value not there");
        }


    }

    private static int linearSearch(int[] array, int value){
        for(int x=0 ; x<array.length; x++){
            if(array[x]==value){
                return x;
            }
        }
        return -1;
    }
}

public class Game {

    public static int makeNumber(int[] tall) {
        int counter = 0;
        for(int i=0; i<tall.length; i++){
        if(tall[i]==1){
            counter++;
        }
        }
        return counter;
    }
}

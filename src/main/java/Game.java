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

    public static int checkForTwos(int[] twos) {
        int counter = 0;
        for (int i=0;i<twos.length;i++) {
            if(twos[i]==2) {
                counter += 1;
            }
        }
        return counter;
    }


    public static int countThrees(int[] tall) {
        int counter = 0;
        for(int t : tall){
            if(t == 3){
                counter++;
            }
        }
        return counter;
    }

}

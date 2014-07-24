
public class HFMain {
    public static void main(String[] args){
        String[] wordLinesOne={"24/7", "multi-Tier", "30 000 foot", "B-to-B", "win-win"};
        String[] wordLinesTwo={"empowered", "sticky", "value-added", "oriented", "centric", "distributed"};
        String[] wordLinesThree={"process", "tipping-point", "solution", "architecture"};

        //find out how many words are in each list
        int oneLength=wordLinesOne.length;
        int twoLength=wordLinesTwo.length;
        int threeLength=wordLinesThree.length;

        //generate three random numbers
        int rand1=(int) (Math.random() * oneLength);
        int rand2=(int) (Math.random() * twoLength);
        int rand3=(int) (Math.random() * threeLength);

        //building a phrase
        String phrase=wordLinesOne[rand1]+" "+wordLinesTwo[rand2]+" "+wordLinesThree[rand3];

        //Print
        System.out.println(phrase);

    }
}

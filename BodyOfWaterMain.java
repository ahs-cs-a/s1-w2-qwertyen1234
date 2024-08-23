public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake Michigan" , 118, 279, false);
        BodyOfWater b1 = new BodyOfWater("Lake Erie" , 57, 62, false);

        b.setName("Atlantic Ocean");
        b.setlargestDiameter(1770);
        b.setavgDepth(10932);
        b.setisSaltWater(false);


        System.out.println("here");
    }
}

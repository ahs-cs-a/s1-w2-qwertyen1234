public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake Michigan" , 118, 279, false);
        BodyOfWater b1 = new BodyOfWater("Lake Erie" , 57, 62, false);
        

        b.setName("Lake Michigan");
        b.setlargestDiameter(118);
        b.setavgDepth(279);
        b.setisSaltWater(false);
        
        System.out.println(b.getName());
        System.out.println(b.getlargestDiameter());
        System.out.println(b.getavgDepth());
        System.out.println(b.getisSaltWater());

        b1.setName("Lake Erie");
        b1.setlargestDiameter(57);
        b1.setavgDepth(62);
        b1.setisSaltWater(false);
        
        System.out.println(b1.getName());
        System.out.println(b1.getlargestDiameter());
        System.out.println(b1.getavgDepth());
        System.out.println(b1.getisSaltWater());
        
    }
}
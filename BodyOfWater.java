public class BodyOfWater{
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;
    

    public BodyOfWater(String Name, double ldiam, double avgdep, boolean saltwtr){
        name = Name;
        largestDiameter = ldiam;
        avgDepth = avgdep;
        isSaltWater = saltwtr;

    }

    public BodyOfWater(String n, double avgdep){
        name = n;
        avgDepth = avgdep;

    }
    //SETTERS


    public void setName(String n){
        name = n;
    }
    public void setlargestDiameter(double d){
        largestDiameter = d;
    }
    public void setavgDepth(double a){
        avgDepth = a;
    }
    public void setisSaltWater(boolean s){
        isSaltWater = s;
    }

    //GETTERS

    public String getName(){
        return name;
    }
    
    public double getlargestDiameter(){
        return largestDiameter;
    }

    public double getavgDepth(){
        return avgDepth;
    }

    public boolean getisSaltWater(){
        return isSaltWater;
    }

}
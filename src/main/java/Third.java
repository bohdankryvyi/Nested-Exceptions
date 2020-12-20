public class Third {
    String text = "Text from Outer Third class";

    //anonymous class for Interface implementation
    ForAnonymous anonymousObj = new ForAnonymous() {
         public double getInDeca() {
           return Math.pow((double)a,10.0);
        }
    };
    public String concatenation(){
        return text+ anonymousObj.getInDeca();
    }

}

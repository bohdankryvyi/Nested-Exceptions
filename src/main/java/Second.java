public class Second {
    String text = "Lol";
    int a = 1;
    public  class InnerShadowClass{
        int a = 10;
        int b = 2;
        public String concatenation(){
            return a+b +" "+ text;
        }
    }
}

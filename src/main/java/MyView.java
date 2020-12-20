import java.util.*;

public class MyView {
    private Map<String, String> menu;
    private Map<String, Printable> methodMenu;
    private static Scanner input = new Scanner(System.in);
    ArrayList<String> maty = new ArrayList<String>();

    //String[] maty = new String[] {"Fuck", "Bitch", "Oleh", "Volianchuk","Bastard","Wankers"};

    public MyView() {
        menu = new LinkedHashMap<>();
        menu.put("1", " 1- Inner");
        menu.put("2", " 2- Inner Shadowing");
        menu.put("3", " 3- Anonymous");
        menu.put("4", " 4- Static Nested");
        menu.put("5", " 5- Local");

        methodMenu = new LinkedHashMap<>();
        methodMenu.put("1", this::pressButton1);
        methodMenu.put("2", this::pressButton2);
        methodMenu.put("3", this::pressButton3);
        methodMenu.put("4", this::pressButton4);
        methodMenu.put("5", this::pressButton5);

    }

    // виводимо першу мапу чисто як меню для юзера
    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }


    private void pressButton1() {
        System.out.println("class First for showing results for INNER CLASS");
        First myFirst = new First();
        First.InnerClass inner = myFirst.new InnerClass();
        System.out.println(inner.concatenation());
    }

    private void pressButton2() {
        System.out.println("class Second for showing results for INNER Shadowing CLASS");
        Second mySecond = new Second();
        Second.InnerShadowClass InnerShadow = mySecond.new InnerShadowClass();
        System.out.println(InnerShadow.concatenation());
    }

    private void pressButton3() {
        System.out.println("class Third for showing results for ANONYMOUS CLASS");
        Third third = new Third();
        System.out.println(third.concatenation());

    }

    private void pressButton4() {
        System.out.println("class Fourth for showing results for STATIC NESTED CLASS");
        Fourth myFourth = new Fourth();
        Fourth.InnerClass staticNested = new Fourth.InnerClass();
        System.out.println(staticNested.concatenation());

    }

    private void pressButton5() {
        System.out.println("class Fifth for showing results for LOCAL CLASS");
        Fifth myFifth = new Fifth();
        Fifth fifth = new Fifth();
        System.out.println(fifth.concatenation());

    }


    public void show() throws CustomException {
        String keyMenu;
        outputMenu();
        System.out.println("Please, select menu point that you wanna see");
        keyMenu = input.nextLine();

        maty.add("Fuck");
        maty.add("Oleg");
        maty.add("Volianchuk");
        maty.add("Bitch");
        maty.add("Bastard");
        maty.add("Wanker");


        for (String element : maty){
            if (keyMenu.equals(element)) {
                throw new CustomException("You are using bad word. Pishow nahui");
            }
        }

        try {
            methodMenu.get(keyMenu).print();
        } catch (Exception e) {

        }

    }

}

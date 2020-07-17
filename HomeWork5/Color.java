package HomeWork5;

public enum Color {
    BLUE(2, "синий"),
    ORANGE(1, "оранжевый"),
    RED(4, "красный"),
    YELLOW(3, "жёлтый");

    private final int id;
    private final String rusName;


    Color(int id, String rusName) {
        this.id = id;
        this.rusName = rusName;

    }

    public int getId() {
        return id;
    }

    public String getRusName() {
        return rusName;
    }



//    public String toString() {
//        return Color.name.toString();
//    }

//    private Color equals(Color RED, String red) {
//        return RED;
//    }


//    public static String changeColor(String nameColor) {
//        String red = Color.RED.toString();
//        String yellow = Color.YELLOW.toString();
//        String orange = Color.ORANGE.toString();
//        String blue = Color.BLUE.toString();
////        if(nameColor == red) {
////            System.out.println(red);
////            }
////        if(nameColor == yellow) {
////            System.out.println(yellow);
////        }
////        if(nameColor == orange) {
////            System.out.println(orange);
////        }
////        if(nameColor == blue) {
////            System.out.println(blue);
////        }
//        return nameColor;
//    }

}


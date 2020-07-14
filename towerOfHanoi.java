package HomeWork4;

import java.util.Objects;
import java.util.Scanner;

public class towerOfHanoi {

    //переменные игрового поля
    public static char[][] map; // поле игры
    public static final int numberKernel = 3; // количество стержней в игре

    //ячейки поля
    public static final char emptyCell = '*'; // обозначение пустых ячеек
    public static final char ring1 = '1';
    public static final char ring2 = '2';
    public static final char ring3 = '3';


    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Ханойская башня!");
        System.out.println("Правила игры!");
        System.out.println("Игоровое поле: ");
        System.out.println("1 * *");
        System.out.println("2 * *");
        System.out.println("3 * *");
        System.out.println("Где цифра - это кольцо определённого размера, * - это пустое место на стержне");
//        System.out.println("Выберите режим игры: auto - автоматический режим, manual - ручной режим");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество колец. Минимальное количество колец 3!");
        int r = 3; //минимальное количество колец
        int count = scanner.nextInt(); // количество колец

        if (count > 2 && count < 9) {
            System.out.println("Количество колец = " + count);

        } else {
            System.out.println("Количество колец должно быть не менее 3 и не более 8!");
            return;
        }


        map = new char[count][numberKernel];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < numberKernel; j++) {
                map[2][0] = ring3;
                map[1][0] = ring2;
                map[0][0] = ring1;
                map[i][1] = emptyCell;
                map[i][2] = emptyCell;
            }
        }

        printMap();

        System.out.println("Введите число 12 или 13 для перемещения кольца номер 2");
        int number = scanner.nextInt();
        if (Objects.equals(number, 12)) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[0][0] = emptyCell;
                    map[2][1] = ring1;
                }
            }
            printMap();
            System.out.println("Введите число 22 или 23 для перемещения кольца номер 2");
            int number2 = scanner.nextInt();
            if (Objects.equals(number2, 23)) {
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        map[1][0] = emptyCell;
                        map[2][2] = ring2;
                    }
                }
                printMap();

            } else if (Objects.equals(number2, 22)) {
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        System.out.println("Ход невозможен!");
                    }
                }
            } else {
                System.out.println("Ведите другое число! 22 или 23");
            }

        } else if (Objects.equals(number, 13)) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[0][0] = emptyCell;
                    map[2][2] = ring1;
                }
            }
            printMap();
            System.out.println("Введите число 22 или 21 для перемещения кольца номер 2");
            int number3 = scanner.nextInt();
            if (Objects.equals(number3, 22)) {
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        map[1][0] = emptyCell;
                        map[2][1] = ring2;
                    }
                }
                printMap();

                System.out.println("Введите число 12 или 13 для перемещения кольца номер 1");
                int number4 = scanner.nextInt();
                if (Objects.equals(number4, 12)) {
                    for (int i = 0; i < map.length; i++) {
                        for (int j = 0; j < map[i].length; j++) {
                            map[2][2] = emptyCell;
                            map[1][1] = ring1;
                        }
                    }
                    printMap();

                    System.out.println("Введите число 32 или 33 для перемещения кольца номер 3");
                    int number5 = scanner.nextInt();
                    if (Objects.equals(number5, 33)) {
                        for (int i = 0; i < map.length; i++) {
                            for (int j = 0; j < map[i].length; j++) {
                                map[2][0] = emptyCell;
                                map[2][2] = ring3;
                            }
                        }
                        printMap();

                        System.out.println("Введите число 11 или 13 для перемещения кольца номер 1");
                        int number6 = scanner.nextInt();
                        if (Objects.equals(number6, 11)) {
                            for (int i = 0; i < map.length; i++) {
                                for (int j = 0; j < map[i].length; j++) {
                                    map[1][1] = emptyCell;
                                    map[2][0] = ring1;
                                }
                            }
                            printMap();
                            System.out.println("Введите число 23 или 21 для перемещения кольца номер 2");
                            int number7 = scanner.nextInt();
                            if (Objects.equals(number7, 23)) {
                                for (int i = 0; i < map.length; i++) {
                                    for (int j = 0; j < map[i].length; j++) {
                                        map[2][1] = emptyCell;
                                        map[1][2] = ring2;
                                    }
                                }
                                printMap();
                                System.out.println("Введите число 12 или 13 для перемещения кольца номер 1");
                                int number8 = scanner.nextInt();
                                if (Objects.equals(number8, 13)) {
                                    for (int i = 0; i < map.length; i++) {
                                        for (int j = 0; j < map[i].length; j++) {
                                            map[2][0] = emptyCell;
                                            map[0][2] = ring1;
                                        }
                                    }
                                    printMap();


                                } else  {
                                    System.out.println("Ход невозможен!");
                                }

                            } else  {
                                System.out.println("Ход невозможен!");
                            }

                        } else  {
                            System.out.println("Ход невозможен!");
                        }
                    } else  {
                        System.out.println("Ход невозможен!");
                    }

                } else  {
                    System.out.println("Ход невозможен!");
                }
            } else  {
                System.out.println("Ход невозможен!");
                    }
        } else {
            System.out.println("Ведите другое число! 12 или 13");
        }

    }

    private static void printMap() {
        for (int i = 0; i < map.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < numberKernel; j++) {
                System.out.print(map[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

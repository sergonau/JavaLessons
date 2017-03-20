package Lesson017.Test03;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Singleton pattern Lazy initialization.

1. Создать интерфейс Planet, в нём создать 3 переменные:
    String SUN = "sun";
    String MOON = "moon";
    String EARTH = "earth";
2. В отдельных файлах создать три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
4. В классе Solution создать переменную static Planet thePlanet;
4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet,
то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
6. В методе main вывести на экран значение переменной thePlanet.
*/
public class Test03_ {

    static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String s = reader.readLine();
            if (Planet.EARTH.equals(s)) {
                thePlanet = Earth.getINSTANCE();
            } else if (Planet.MOON.equals(s)) {
                thePlanet = Moon.getINSTANCE();
            } else if (Planet.SUN.equals(s)) {
                thePlanet = Sun.getInstance();
            } else break;
            System.out.println(thePlanet);

        }

    }

    public static void main(String[] args) {
        System.out.println(thePlanet);
    }
}
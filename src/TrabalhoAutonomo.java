public class TrabalhoAutonomo {

    public static void main(String[] args){

///////////////////////////////////////

// 12
    double recareaResult = recarea (15, 10, 5);
    System.out.println("The area is " + recareaResult + "cm2");
// 11
    double circumferenceResult = circumference (15);
    System.out.println("The circumference of the circle is " + circumferenceResult + "cm");
// 10
    double aproxResult = aprox (2.7);
    System.out.println("The aproximate result is " + aproxResult);
// 9
    double ivaResult = iva (100);
    System.out.println("The price without IVA is " + ivaResult + "€");
// 8
    double inchesResult = inches(30);
    System.out.println("The length is " + inchesResult + "in");
// 7
    double kelvinResult = kelvin(25);
    System.out.println("The temperature is " + kelvinResult + "ºK");
// 6
    double fahrenheitResult = fahrenheit(25);
    System.out.println("The temperature is " + fahrenheitResult + "ºF");
// 5
    int areaResult = area(5, 2);
    System.out.println("The area is " + areaResult + "cm2");
// 4
    int averageResult = average(4, 8);
    System.out.println("The average of both numbers is " + averageResult);
// 3
    int differenceResult = difference(5, 2);
    System.out.println("The difference between both numbers is " + differenceResult);
// 2
    int squareResult = square(3);
    System.out.println("The square of the number is " + squareResult);
// 1
    int sumResult = sum(2,3);
    System.out.println("The sum of both numbers is " + sumResult);
    }

///////////////////////////////////////

// 12
    static double recarea (double l, double w, double h){
        return 2 * (w * l + h * l + h * w);
    }
// 11
    static double circumference (double diameter){
        return 2 * Math.PI * (diameter / 2);
    }
// 10
    static int aprox (double dec){
        if (dec < 0)
            {return (int) (dec - 0.5);}
        else
            {return (int) (dec + 0.5);}
    }
// 9
    static double iva (double e){
        return e - e / 1.23;
    }
// 8
    static double inches (double cm){
        return cm * 0.3937;
    }
// 7
    static double kelvin (double c){
        return c + 273.15;
    }
// 6
    static double fahrenheit (double c){
        return c * 1.8 + 32;
    }
// 5
    static int area (int l, int w){
        return l * w;
    }
// 4
    static int average (int a, int b){
        return (a + b) / 2;
    }
// 3
    static int difference (int a, int b){
        return a - b;
    }
// 2
    static int square (int a){
        return a * a;
    }
// 1
    static int sum (int a, int b){
        return a + b;
    }
}

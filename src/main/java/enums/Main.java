package enums;

import enums.homework.HttpCodeHandler;

public class Main {
    public static void main(String[] args) {
        new HttpCodeHandler().handleHttpCode(455);
        System.out.println();
        new HttpCodeHandler().handleHttpCode(155);
        System.out.println();
        new HttpCodeHandler().handleHttpCode(255);
        System.out.println();
        new HttpCodeHandler().handleHttpCode(301);
        System.out.println();
        new HttpCodeHandler().handleHttpCode(565);
    }
}

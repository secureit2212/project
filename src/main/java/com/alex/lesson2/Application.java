package com.alex.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String s = scanner.nextLine();

            String[] tokens = s.split(" ");

            switch (tokens[0]) {
                case "add":
                    String task = s.substring(3);
                    list.add(task);

                    break;
                case "list":

                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + " " + list.get(i));
                    }

                    break;
                case "delete":
                    list.remove(Integer.parseInt(tokens[1]) - 1);
                    break;

                default:
                    System.out.println("unknown");

            }
        }
    }
}


package com.company;

import com.company.geather.First;
import com.company.geather.Geather;
import com.company.geather.Second;
import com.company.geather.Last;

import java.util.Scanner;

public class Main {

    private static Home max()
    {
        Home max;
        Geather geather;
        Scanner scanner = new Scanner(System.in);
        System.out.print("First: \nSecond: \nLast: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            geather = new First();
        }
        else if(choice == 2){
            geather = new Second();
        }else{
            geather = new Last();
        }

        max = new Home(geather);
        return max;
    }

    public static void main(String[] args) {
        Home max  = max();
        max.Display();

    }
}

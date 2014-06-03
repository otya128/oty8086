package com.github.otya128;
import java.lang.System;
import com.github.otya128.Machine8086;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("8086???");
        if(args.length!=1) {
            System.out.print("Usage: java oty806.jar [bin file]");
            return;
        }
        Machine8086 machine8086 = new Machine8086();

    }
}
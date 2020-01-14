package com.Igor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex{
    public String pattern0="([01]\\d{2}|\\d{2}|[2][0-4]\\d{1}|[2][5][0-5]|\\d{1})";
    public String pattern=pattern0+"[.]"+pattern0+"[.]"+pattern0+"[.]"+pattern0;
        }
//Write your code here

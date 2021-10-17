package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class basic100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("hello");
//        System.out.println("hello" + " " + "world");
//        System.out.println("hello\nworld");
//        System.out.println("\"hello world\"");

//        //X
//        int n = sc.nextInt();
//        System.out.println(n);
//        //X
//        char c = sc.next().charAt(0);
//        System.out.println(c);
//        //실수입력
//        float f = sc.nextFloat();
//        System.out.println(f);
//        //정수 2개
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a + " " + b);
//
//        //문자 2개
//        char x = sc.next().charAt(0);
//        char y = sc.next().charAt(0);
//        System.out.println(y + " " + x);
//
//        //정수 1개 입력 3개출력
//        int n = sc.nextInt();
//        System.out.println(n+" "+n+" "+n);

        //시간 입력받고 그대로 출력
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a + ":" + b);

        //**한번더**
        //연월일 입력받고 출력
//        String ymd = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(ymd, ".");
//        int[] arr = new int[3];
//        int i=0;
//        while (st.hasMoreTokens()) {
//            arr[i] = Integer.parseInt(st.nextToken()); //닷기준으로 짜른거
//            i++;
//        }
//        String year = String.format("%04d", arr[0]);
//        String month = String.format("%02d", arr[1]);
//        String day = String.format("%02d", arr[2]);
//        System.out.println(year + "." + month + "." + day);
//    }
        //**한번더**
        //주민번호 입력받고 출력
        //내가 푼버전
//        String n = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(n, "-");
//
//        int[] arr = new int[2];
//
//        int i =0;
//        while (st.hasMoreTokens()) {
//            arr[i] = Integer.parseInt(st.nextToken());
//            i++;
//        }
//        String first = String.format("%06d", arr[0]);
//        String end = String.format("%07d", arr[1]);
//        System.out.println(first + end);
//

//        //다른사람
//        String n = sc.nextLine();
//        String front = n.substring(0, 6);
//        String back = n.substring(7);
//        System.out.println(front + back);

//        //단어입력받고 출력
//        String s = sc.nextLine();
//        System.out.println(s);

//        //실수 1개입력받고 정수 실수 나누어 출력
//        String s = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(s, ".");
//        String[] str = new String[2];
//        int i=0;
//        while (st.hasMoreTokens()) {
//            str[i] = st.nextToken();
//            i++;
//        }
//        System.out.println(str[0] + "\n" + str[1]);

        //***한번더***
        //연입력받고 형실바꿔출력하기

//        String n = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(n, ".");
//        String[] str = new String[3];
//
//        int i=0;
//        while (st.hasMoreTokens()) {
//            str[i] = st.nextToken();
//            i++;
//        }
//        System.out.println(str[0] + "-" + str[1] + "-" + str[2]);

        //다른사람
        //주의 . 쓸때는 \\붙여줘야한다
//        String n = sc.nextLine();
//        String[] ns = n.split("\\.");
//        System.out.println(ns[0] + "-" + ns[1] + "-" + ns[2]);

        //문자 입력받고 정수출력
//        char c = sc.next().charAt(0);
//        System.out.println((int) c);

//        int n = sc.nextInt();
//        System.out.println((char) (n + 1));

        //두개가 모두 참일때 참반환
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a == 1 && b == 1) {
//            System.out.println(1);
//
//        } else System.out.println(0);

        //3개중 작은 수 출력
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println((a > b ? b : a) >= c ? c : (a > b ? b : a));


        //0입력받을떄까지 무한출력
//        while (true) {
//            int n = sc.nextInt();
//            System.out.println(n);
//            if(n==0) break;
//        }

        //정수 갯수 입력받고 그대로 출력
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int input = sc.nextInt();
//            System.out.println(input);
//        }

        //***한번더****
//        char c = sc.next().charAt(0);
//
//        int n = (int) c;
//        char first = 'a';
//
//        for (int i = 0; i < n - 97; i++) {
//            System.out.print(first + " ");
//            first += 1;
//        }

        //정수 입력받고 짝수 합 더하기

//        int n = sc.nextInt();
//        int result = 0;
//        for (int i = 1; i < n+1; i++) {
//            if (i % 2 == 0) {
//                result += i;
//            }
//        }
//        System.out.println(result);

//        while (true) {
//            char c = sc.next().charAt(0);
//            System.out.println(c);
//            if(c=='q') break;
//        }

//        int n = sc.nextInt();
//        int result = 0;
//        for (int i = 1; i < n+1; i++) {
//            result += i;
//        }
//        System.out.println(result);
//

        //구구단
//        int n = sc.nextInt();
//        for (int i = 1; i < n+1; i++) {
//            if(i%3==0) System.out.printf("X" + " ");
//            else System.out.printf(i + " ");
//        }
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int cnt =0;
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                for (int y = 0; y< c; y++) {
//
//                    System.out.println(i + " " + j + " " + y);
//                    cnt++;
//                }
//
//            }
//        }
//        System.out.println(cnt);

//        //출석번호 횟수
//
//        int n = sc.nextInt();
//        int[] arr = new int[23];
//
//        for (int i = 0; i < n; i++) {
//            int input = sc.nextInt();
//            arr[input - 1] += 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

//        //거꾸로 출력
//        int n = sc.nextInt();
//        int[] arr = new int[23];
//        for (int i = 0; i < n; i++) {
//            int input = sc.nextInt();
//            arr[n -1 - i] = input;
//
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }


        //출석번호 제일 빠른 순서

        int n = sc.nextInt();

        String input = sc.nextLine();

        String[] str = input.split(" ");

        for (int i = 0; i < str.length; i++) {
            
        }




    }

}
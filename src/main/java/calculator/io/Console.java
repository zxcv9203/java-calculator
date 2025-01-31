package calculator.io;

import calculator.repository.ExpressRepository;

import java.util.Map;
import java.util.Scanner;

public class Console implements Input, Output {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine();
    }

    @Override
    public void answerPrint(int answer) {
        System.out.println(answer);
    }

    @Override
    public void historyPrintFormat(String exp, int answer) {
        System.out.println(exp + "=" + answer);
    }

    public void menu() {
        System.out.println("1. 조회");
        System.out.println("2. 계산");
        System.out.println("3. 프로그램 종료");
        System.out.print("선택 : ");
    }

}

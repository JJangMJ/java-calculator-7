package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String userInput = Console.readLine();

        String[] parsedNumbers = parseInput(userInput);
        int sumResult = sumParsedNumbers(parsedNumbers);

        System.out.println("결과 : " + sumResult);
    }
}

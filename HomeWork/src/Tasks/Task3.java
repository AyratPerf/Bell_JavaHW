package Tasks;

import java.util.Scanner;

//Выглядит страшно, но я так и не понял, как через 2 цикла решить

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gift weight");
        int gift = sc.nextInt();
        System.out.println("Enter orange weight");
        int orange = sc.nextInt();
        System.out.println("Enter apple weight");
        int apple = sc.nextInt();
        System.out.println("Enter pear weight");
        int pear = sc.nextInt();
        sc.close();
        int answer = 0;
        int weightOrange, weightApple, weightPear;
        int orangeCount = gift / orange, appleCount = gift / apple, pearCount = gift / pear;
        for (int i = 0; i <= orangeCount; i++) {
            weightOrange = gift - orange * i;
            if (weightOrange > 0) {
                for (int j = 0; j <= appleCount; j++) {
                    weightApple = weightOrange - apple * j;
                    if (weightApple > 0) {
                        for (int k = 0; k <= pearCount; k++) {
                            weightPear = weightApple - pear * k;
                            if (weightPear == 0) {
                                answer++;
                            }
                        }
                    } else if (weightApple == 0) {
                        answer++;
                    }
                }
            } else if (weightOrange == 0) {
                answer++;
            }
        }
        System.out.println("You can make " + answer + " gift options");
    }
}

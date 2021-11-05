# LeetCode-problems
This repository is locally named Learn Java with Kunal and is maintained and updated by me.
* This repo contains solutions to easy and medium LeetCode problems and also some practice java-classes.
* You can propose changes to the contents of this repository if you find something wrong with the code.
* Create a pull request with the appropriate tag and a clear explanation.
* The main source of the assorted problems are from [this repo](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/tree/main/assignments).
* Making some more changes.
```java
import java.util.Scanner;

public class Readme {
    public static void main(String[] args) {
        System.out.println("This is how we write any code inside a markdown");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n);
    }

    static int rec(int n) {
        if (n == 0)
            return 0;
        else return rec(n - 1);
    }
}
```

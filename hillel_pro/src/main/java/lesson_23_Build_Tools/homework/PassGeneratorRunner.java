package lesson_23_Build_Tools.homework;

import org.example.PasswordGenerator;

import java.util.ArrayList;
import java.util.List;

public class PassGeneratorRunner {
    public static void main(String[] args) {
        PasswordGenerator random = new PasswordGenerator();
        List<String> passwords = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            passwords.add(random.generatePassword(7));
        }

        passwords.stream().forEach(System.out::println);

    }
}

/*
СONSOLE OUTPUT:
%egkZeV
9zCCxPL
(80d*HB
z%VOsf6
9g2yx%(
F$ME_9^
Az4xB?Z
Ms9UG+b
yN9YMdi
6h?a9lo
i3YXtGM
hRhg^vs
fpEWvL+
K07YRu&
lA4KJr7
 */
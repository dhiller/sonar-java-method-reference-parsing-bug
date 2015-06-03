package de.dhiller.sonar.parsing_bug;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ParsingBugTest {

    @Test
    public void parse() {
        org.sonar.java.JavaAstScanner.scanSingleFile(
                new File(System.getProperty("user.dir") + "/src/main/java/de/dhiller/sonar/parsing_bug/ParsingBug.java")
        );
    }
}

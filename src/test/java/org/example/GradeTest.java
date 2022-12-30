package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {
    @Test
    public void TestA(){
        Assertions.assertEquals('A', Grade.letterGrade(95));
    }

    @Test
    public void TestB(){
        Assertions.assertEquals('B', Grade.letterGrade(85));
    }

    @Test
    public void TestC(){
        Assertions.assertEquals('C', Grade.letterGrade(71));
    }

    @Test
    public void TestD(){
        Assertions.assertEquals('D', Grade.letterGrade(61));
    }

    @Test
    public void TestF(){
        Assertions.assertEquals('F', Grade.letterGrade(40));
    }

    @Test
    public void TestX(){
        Assertions.assertEquals('X', Grade.letterGrade(101));
        Assertions.assertEquals('X', Grade.letterGrade(-1));
    }
}
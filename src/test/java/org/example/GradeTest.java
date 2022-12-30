package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {
    @Test
    public void TestA(){
        Assertions.assertEquals('A', letterGrade.letterGrade(95));
    }

    @Test
    public void TestB(){
        Assertions.assertEquals('B', letterGrade.letterGrade(85));
    }

    @Test
    public void TestC(){
        Assertions.assertEquals('C', letterGrade.letterGrade(71));
    }

    @Test
    public void TestD(){
        Assertions.assertEquals('D', letterGrade.letterGrade(61));
    }

    @Test
    public void TestF(){
        Assertions.assertEquals('F', letterGrade.letterGrade(40));
    }

    @Test
    public void TestX(){
        Assertions.assertEquals('X', letterGrade.letterGrade(101));
        Assertions.assertEquals('X', letterGrade.letterGrade(-1));
    }
}
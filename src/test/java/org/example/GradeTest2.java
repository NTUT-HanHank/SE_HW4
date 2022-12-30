package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest2 {
    @Test
    public void Test99_101(){
        Assertions.assertEquals('X', letterGrade.letterGrade(101));
        Assertions.assertEquals('A', letterGrade.letterGrade(100));
        Assertions.assertEquals('A', letterGrade.letterGrade(99));
    }

    @Test
    public void Test89_91(){
        Assertions.assertEquals('A', letterGrade.letterGrade(91));
        Assertions.assertEquals('A', letterGrade.letterGrade(90));
        Assertions.assertEquals('B', letterGrade.letterGrade(89));
    }

    @Test
    public void Test79_81(){
        Assertions.assertEquals('B', letterGrade.letterGrade(81));
        Assertions.assertEquals('B', letterGrade.letterGrade(80));
        Assertions.assertEquals('C', letterGrade.letterGrade(79));
    }

    @Test
    public void Test69_71(){
        Assertions.assertEquals('C', letterGrade.letterGrade(71));
        Assertions.assertEquals('C', letterGrade.letterGrade(70));
        Assertions.assertEquals('D', letterGrade.letterGrade(69));
    }

    @Test
    public void Test59_61(){
        Assertions.assertEquals('D', letterGrade.letterGrade(61));
        Assertions.assertEquals('D', letterGrade.letterGrade(60));
        Assertions.assertEquals('F', letterGrade.letterGrade(59));
    }

    @Test
    public void Test1ToMinus1(){
        Assertions.assertEquals('F', letterGrade.letterGrade(1));
        Assertions.assertEquals('F', letterGrade.letterGrade(0));
        Assertions.assertEquals('X', letterGrade.letterGrade(-1));
    }
}
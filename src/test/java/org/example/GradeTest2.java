package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest2 {
    @Test
    public void Test99_101(){
        Assertions.assertEquals('X', Grade.letterGrade(101));
        Assertions.assertEquals('A', Grade.letterGrade(100));
        Assertions.assertEquals('A', Grade.letterGrade(99));
    }

    @Test
    public void Test89_91(){
        Assertions.assertEquals('A', Grade.letterGrade(91));
        Assertions.assertEquals('A', Grade.letterGrade(90));
        Assertions.assertEquals('B', Grade.letterGrade(89));
    }

    @Test
    public void Test79_81(){
        Assertions.assertEquals('B', Grade.letterGrade(81));
        Assertions.assertEquals('B', Grade.letterGrade(80));
        Assertions.assertEquals('C', Grade.letterGrade(79));
    }

    @Test
    public void Test69_71(){
        Assertions.assertEquals('C', Grade.letterGrade(71));
        Assertions.assertEquals('C', Grade.letterGrade(70));
        Assertions.assertEquals('D', Grade.letterGrade(69));
    }

    @Test
    public void Test59_61(){
        Assertions.assertEquals('D', Grade.letterGrade(61));
        Assertions.assertEquals('D', Grade.letterGrade(60));
        Assertions.assertEquals('F', Grade.letterGrade(59));
    }

    @Test
    public void Test1ToMinus1(){
        Assertions.assertEquals('F', Grade.letterGrade(1));
        Assertions.assertEquals('F', Grade.letterGrade(0));
        Assertions.assertEquals('X', Grade.letterGrade(-1));
    }
}
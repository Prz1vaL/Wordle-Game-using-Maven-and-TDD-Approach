package stacs.wordle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordleAppTest {

    @Test
    void main() throws ClassNotFoundException {
        getClass().getClassLoader().getResource("instructions.txt");
        getClass().getClassLoader().loadClass("stacs.wordle.mainService.MainService");
    }
}
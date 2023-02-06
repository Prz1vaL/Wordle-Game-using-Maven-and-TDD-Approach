package stacs.wordle;

import org.junit.jupiter.api.Test;

class WordleAppTest {

    @Test
    void main() throws ClassNotFoundException {
        getClass().getClassLoader().loadClass("stacs.wordle.MainService");
        getClass().getClassLoader().loadClass("stacs.wordle.ScoreEngine");
        getClass().getClassLoader().loadClass("stacs.wordle.MainService");


    }
}
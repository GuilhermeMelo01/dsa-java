package io.github.guilhermemelo01.design_pattern_oop.abstract_factory.base;

public class MazeFactory {

    public MazeFactory(){}

    public MazeFactory makeMaze(){
        return new MazeFactory();
    }
}

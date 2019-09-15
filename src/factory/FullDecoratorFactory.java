package factory;

import decorator.QuackEcho;
import decorator.QuackCounter;
import quack.Quackable;

public class FullDecoratorFactory extends DuckFactory{
    @Override
    public Quackable makeMallardDuck() {
        return new QuackEcho(new QuackCounter(super.makeMallardDuck()));
    }

    @Override
    public Quackable makeDuckCall() {
        return new QuackEcho(super.makeDuckCall());
    }

    @Override
    public Quackable makeGoose() {
        return new QuackEcho(super.makeGoose());
    }

    @Override
    public Quackable makePigeon() {
        return new QuackEcho(super.makePigeon());
    }

    @Override
    public Quackable makeRedheadDuck() {
        return new QuackEcho(new QuackCounter(super.makeRedheadDuck()));
    }

    @Override
    public Quackable makeRubberDuck() {
        return new QuackEcho(new QuackCounter(super.makeRubberDuck()));
    }
}

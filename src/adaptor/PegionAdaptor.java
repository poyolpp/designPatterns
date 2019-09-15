package adaptor;

import ducks.Pigeon;
import quack.Quackable;

public class PegionAdaptor implements Quackable {
    Pigeon pegion;
    public PegionAdaptor(Pigeon pegion){
        this.pegion = pegion;
    }

    @Override
    public void quack() {
        pegion.coo();
        pegion.coo();
    }
}

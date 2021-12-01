package one;

import base.BaseClass;

public class ClassOne extends BaseClass {

    private String ClassOneName;

    public void getById() {

    }

    @Override
    public void getByIdInBase() {
        super.getByIdInBase();
        System.out.println("class one");
    }
}

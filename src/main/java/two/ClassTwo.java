package two;

import base.BaseClass;

public class ClassTwo extends BaseClass {

    private String ClassTwoName;

    public void getById() {

    }

    @Override
    public void getByIdInBase() {
        super.getByIdInBase();
        System.out.println("class two");
    }
}

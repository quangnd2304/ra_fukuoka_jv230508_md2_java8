package java8.defaultMethod;

public class DefaultMethodClass implements IDefaultMethod{
    @Override
    public void test01() {
        System.out.println("Triển khai phương thức trừu tượng");
    }
    //Option1: kế thừa
    //Option2: Ghi đè
    @Override
    public void test02() {
        System.out.println("Ghi đè phương thức default của Interface IDefaultMethod");
    }
}

package java8.defaultMethod;

public interface IDefaultMethod {
    //Phương thức trừu tượng
    void test01();
    //Phương thức default là phương thức triển khai - thực thi
    default void test02(){
        System.out.println("Đây là phương thức default thực hiện trong IDefaultMethod");
    }
}

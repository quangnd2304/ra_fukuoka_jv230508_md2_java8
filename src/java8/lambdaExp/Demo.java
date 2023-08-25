package java8.lambdaExp;

public class Demo{
    public static void main(String[] args) {
        //Sử dụng Lambda tính tổng 2 số từ instance của IFunctionInterface
        //-Khởi tạo đối tượng từ IFunctiionInterface bằng biểu thức Lambda
        IFunctionInterface ifi1 = (int a,int b)->{
            int sum = a+b;
            return sum;
        };
        //-In ra tổng
        System.out.println("Tổng 1: "+ifi1.add(10,20));
        IFunctionInterface ifi2 = (a,b)->{
            return a+b;
        };
        System.out.println("Tổng 2: "+ifi2.add(10,20));
        IFunctionInterface ifi3 = (a,b)->a+b;
        System.out.println("Tổng 3: "+ifi3.add(10,20));
    }
}

package day01;

public class Demo03 {
    public static void main(String[] args) {
//      5、运算符和表达式
//      5-1、算数运算符: +,-,*,/,++,--,%

        // ++ --只能用在变量上
        //int a=10++;
        int aa=10;
        System. out. println(++aa);
        int bb=20;
        System. out. println(--bb);
        int c=10;
        int d=++c;//先自增后运算
        int e=c++;//先运算后自增
        System.out.println(d);
        System.out.println(e);

//      5-2、 赋值运算符: =,+=,-+,*=,/=,%=
        int f=10;//基本赋值运算符
        f+=5;
        System. out. println(f);
        int s2=2,d2=3,f2=4;//同类型的变量可以同时赋值


//      5-3、 比较运算符: >,<,>=,<=,==,!=
        System.out.println(1>2);
        System.out.println(6>=6);//或者的关系
        System.out.println(8==8);
        System.out.println(8!=8);
        //System.out.println(8=8);
        //5-4、逻辑运算符: &,|,!,&&,| | ,个
        System. out . println(1>2&3>1);
        System. out . println(1>2||3>1) ;


//      5-4、逻辑运算符
//      5-5、连接运算符
//      5-6、三目运算符
//      5-7、位运算符

       
   } 
}
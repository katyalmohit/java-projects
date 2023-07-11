class A{
    void callme(){
        System.out.println("Inside A's callme method");
    }
}
class B extends A{
    void callme(){
        System.out.println("Inside B's callme body");
    }
}
class C extends A{
    void callme(){
        System.out.println("Inside C's callme body ");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A a = new  A();
        B b = new  B();
        C c = new  C();

        A r;
        r=a;
        r.callme();
        System.out.println(r);

        r=b;
        r.callme();
        System.out.println(r);

        r=c;
        r.callme();
        System.out.println(r);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
package EffectiveJava3.item2;

public class JavaBeans {
    /**
     *
     * 점층적 생성자 패턴의 단점이 자바빈즈패턴에서는 사라졌다.
     * 하지만 자바빈즈 패턴은 객체하나를 생성하는데 여러개의 메소드를 호출해야하는 단점이있고
     * 객체가 완전히 생성되기 전까지는 일관성이 무너진 상태에 놓이게된다.
     *
     * 일관성이 무너지는 문제때문에 클래스를 불변으로 만들수 없고 이 단점을 완화하고자
     * 객체를 수동으로 freezing 하는 작업을 할 수 있으나 다루기가 어려워 실전에서는 사용되지않는다.
     */

    private String name;
    private String addr;
    private String dept;
    private int deptNo;
    private int age;

    public JavaBeans() { }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

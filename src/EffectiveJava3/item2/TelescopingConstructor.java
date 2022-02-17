package EffectiveJava3.item2;



public class TelescopingConstructor {
    /**
     * 점진적 생성자 패턴
     *
     * 간단하게 구현할수 있지만 매개변수 갯수가 많아지면 클라이언트 코드를 작성하거나 읽기가 어려워진다.
     *
     * ex) 20개 매개변수 의 가장 긴 생성자
     * constructor(1,2,3,4,5,6,7,8,9,10,11,12,14,13,15,16,17,18,19,20);
     *
     * 파라미터 안의 값이 무엇인지 헷갈릴 소지가 있고 클라이언트가
     * 실수로 변수의 순서를 바꿔서 보내도 타입이 같다면 생성이 된다..
     */

    private final String name;
    private final String addr;
    private final String dept;
    private final int deptNo;
    private final int age;

    public TelescopingConstructor(String name, String addr){
        this(name,addr,"");
    }

    public TelescopingConstructor(String name, String addr, String dept){
        this(name,addr,dept,0);
    }

    public TelescopingConstructor(String name, String addr , String dept , int deptNo){
        this(name,addr,dept,deptNo,0);
    }

    public TelescopingConstructor(String name, String addr , String dept , int deptNo , int age){
        this.name = name;
        this.addr = addr;
        this.dept = dept;
        this.deptNo = deptNo;
        this.age = age;
    }

}

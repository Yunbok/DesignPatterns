package EffectiveJava3.item2;

public class BuilderPattern {
    /**
     * 아래 구현된 방식으로 만든 클래스는 불변이며
     * Builder 클래스 안에있는 setter들은 Builder 타입으로 리턴하기때문에
     * 연쇄적으로 호출할수있다.
     * 아래 패턴의 클라이언트 코드
     *
     * new BuilderPattern.Builder("이름" , "주소")
     *                      .dept("회사명")
     *                      .deptNo(123)
     *                      .age(20)
     *                      .build();
     *
     * build() 가 호출하는 생성자에서 유효성검사를 해서 잘못된 객체생성을 방지할수 있다.
     *
     */
    private final String name;
    private final String addr;
    private final String dept;
    private final int deptNo;
    private final int age;


    public static class Builder {
        //필수 매개변수
        private final String name;
        private final String addr;
        //선택 매개변수 - 기본값 초기화
        private String dept;
        private int deptNo;
        private int age;

        public Builder(String name,String addr) {
            this.name = name;
            this.addr = addr;
        }
        public Builder dept(String dept) {
            this.dept = dept;
            return this;
        }

        public Builder deptNo(int deptNo) {
            this.deptNo = deptNo;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderPattern bulid() {
            return new BuilderPattern(this);
        }

    }

    private BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.addr = builder.addr;
        this.dept = builder.dept;
        this.deptNo = builder.deptNo;
        this.age = builder.age;
    }
}

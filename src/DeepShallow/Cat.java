package DeepShallow;

public class Cat implements Cloneable{

    private String name;
    private Age age;

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat copy() throws CloneNotSupportedException{
        Cat ret = (Cat)this.clone();

        //case 3 에서 객체가 깊은복사가 되지않을경우 copy 할때 명시적으로 복사한다.
        ret.setAge(new Age(this.age.getYear() , this.age.getValue()));
//      위 소스를 추가하였을때 출력
//        navi
//        yo
//        2021
//        2023


        return ret;
    }
}

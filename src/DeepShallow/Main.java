package DeepShallow;

public class Main {

    public static void main(String[] args)  throws CloneNotSupportedException{

        /*
//      case 1
        Cat navi = new Cat();
        navi.setName("navi");

//        낮은수준의 복사 : 주소값을 복사하는 형태여서 둘중에 하나만 수정되어도
//        둘다 변경됨
        Cat yo = navi;
        yo.setName("yo");

        System.out.println(navi.getName());
        System.out.println(yo.getName());

        출력
        yo
        yo

//      case 2
//        깊은복사의 예제 : Age 가 int 형일때
        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(2);


        Cat yo = navi.copy();
        yo.setName("yo");
        yo.setAge(1);
        System.out.println(navi.getName());
        System.out.println(navi.getAge());
        System.out.println(yo.getName());
        System.out.println(yo.getAge());
//      츌력
//      navi
//      2
//      yo
//      1

         */

//      case 3
//        깊은복사의 예제 : Age 가 Age 객체일때
        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2021,12));


        Cat yo = navi.copy();
        yo.setName("yo");

        //yo.setAge(new Age(2022,1)); 새로운 객체를 넣었을경우에는 문제가 없지만
        // 기존 복사한 객체안의 객체를 변경하였을때는 깊은복사가 이루어지지 않음
        yo.getAge().setYear(2023);
        yo.getAge().setValue(4);

        System.out.println(navi.getName());
        System.out.println(yo.getName());

        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());

//      출력
//      navi
//      yo
//      2023
//      2023

    }
}

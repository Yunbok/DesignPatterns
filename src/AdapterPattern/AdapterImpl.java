package AdapterPattern;


public class AdapterImpl implements Adapter{


    // 스테틱으로 만들었기때문에 인스턴스 생성이 불필요
    // Math math;

    @Override
    public Float twiceOf(Float f) {

//        return (float) Math.twoTime(f.doubleValue());
        System.out.println("기존에 없는 로그도 추가 출력");
        // 기존에 사용하던 double 형태의 계산 알고리즘을 어댑터를 톻해 float 형태도 계산하는 예제
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {

        return (float) Math.half(f.doubleValue());
    }
}

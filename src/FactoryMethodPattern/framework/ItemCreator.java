package FactoryMethodPattern.framework;

public abstract class ItemCreator {


    //템플릿메소드처럼 동작함
    //팩토리메소드 -> 탬플릿메소드를 사용함
    public Item create() {
        Item item;

        //step1
        requestItemInfo();
        //step2
        item = createItem();
        //step3
        createItemLog();

        return item;
    }

    //아이템을 생성하기전에 데이터베이스에서 아이템 정보를 요청
    abstract protected void requestItemInfo();

    //아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 생성 정보를 남깁니다. - > log
    abstract protected void createItemLog();

    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();
}

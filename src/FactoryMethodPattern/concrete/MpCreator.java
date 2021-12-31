package FactoryMethodPattern.concrete;

import FactoryMethodPattern.framework.Item;
import FactoryMethodPattern.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemInfo() {
        System.out.println("DB에서 마력회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력회복 물약을 새로 생성 " + new Date());
    }

    @Override
    protected Item createItem() {
        // 작업
        return new MpPotion();
    }
}

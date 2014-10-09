package com.haizhi.sms.entinfo;

import com.haizhi.sms.service.AbstractSmsSenderTest;

public class EntInfoAbstractSmsSenderTest extends AbstractSmsSenderTest {

    @Override
    public void init() throws Exception {
        smsSender = new EntInfoSmsSender();
        super.init();
    }
}
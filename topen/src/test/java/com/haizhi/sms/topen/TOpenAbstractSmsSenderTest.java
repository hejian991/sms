package com.haizhi.sms.topen;

import com.haizhi.sms.service.AbstractSmsSenderTest;

public class TOpenAbstractSmsSenderTest extends AbstractSmsSenderTest {

    @Override
    public void init() throws Exception {
        smsSender = new TOpenSmsSender();
        super.init();
    }
}
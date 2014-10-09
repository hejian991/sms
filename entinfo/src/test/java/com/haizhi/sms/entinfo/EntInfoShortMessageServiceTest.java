package com.haizhi.sms.entinfo;

import com.haizhi.sms.service.ShortMessageServiceTest;

public class EntInfoShortMessageServiceTest extends ShortMessageServiceTest {

    @Override
    public void init() throws Exception {
        shortMessageService = new EntInfoShortMessageService();
        super.init();
    }
}
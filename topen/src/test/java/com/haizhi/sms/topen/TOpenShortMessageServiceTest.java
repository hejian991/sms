package com.haizhi.sms.topen;

import com.haizhi.sms.service.ShortMessageServiceTest;
import org.junit.Before;

public class TOpenShortMessageServiceTest extends ShortMessageServiceTest {

    @Override
    public void init() throws Exception {
        shortMessageService = new TOpenShortMessageService();
        super.init();
    }
}
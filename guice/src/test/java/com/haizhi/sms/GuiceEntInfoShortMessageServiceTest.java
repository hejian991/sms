package com.haizhi.sms;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.haizhi.sms.guice.EntInfoSmsModule;
import com.haizhi.sms.service.ShortMessageServiceTest;
import com.haizhi.sms.service.ShortMessageService;

/**
 * Created by txfan on 10/9/14.
 */
public class GuiceEntInfoShortMessageServiceTest extends ShortMessageServiceTest {

    @Override
    public void init() throws Exception {
        Injector injector = Guice.createInjector(new EntInfoSmsModule());
        shortMessageService = injector.getInstance(ShortMessageService.class);
        super.init();
    }

}

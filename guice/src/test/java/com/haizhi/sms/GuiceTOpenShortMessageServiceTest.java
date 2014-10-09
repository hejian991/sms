package com.haizhi.sms;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.haizhi.sms.guice.TopenSmsModule;
import com.haizhi.sms.service.ShortMessageServiceTest;
import com.haizhi.sms.service.ShortMessageService;

/**
 * Created by txfan on 10/9/14.
 */
public class GuiceTOpenShortMessageServiceTest extends ShortMessageServiceTest {

    @Override
    public void init() throws Exception {
        Injector injector = Guice.createInjector(new TopenSmsModule());
        shortMessageService = injector.getInstance(ShortMessageService.class);
        super.init();
    }

}

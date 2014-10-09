package com.haizhi.sms.guice;

import com.google.inject.AbstractModule;
import com.haizhi.sms.service.ShortMessageService;
import com.haizhi.sms.topen.TOpenShortMessageService;

/**
 * Created by txfan on 10/9/14.
 */
public class TopenSmsModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ShortMessageService.class).to(TOpenShortMessageService.class);
    }

}

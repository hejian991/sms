package com.haizhi.sms.guice;

import com.google.inject.AbstractModule;
import com.haizhi.sms.entinfo.EntInfoShortMessageService;
import com.haizhi.sms.service.ShortMessageService;

/**
 * Created by txfan on 10/9/14.
 */
public class EntInfoSmsModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ShortMessageService.class).to(EntInfoShortMessageService.class);
    }

}

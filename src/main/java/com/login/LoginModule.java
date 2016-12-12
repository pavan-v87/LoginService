package com.login;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pavan.VijayaNar on 12/12/2016.
 * Login Implementation Instantiate module
 */
@Module
public class LoginModule {

    @Provides
    @Singleton
    Login provideLogin() {
       return new LoginImpl();
    }
}

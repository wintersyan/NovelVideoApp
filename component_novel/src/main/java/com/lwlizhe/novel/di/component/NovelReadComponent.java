package com.lwlizhe.novel.di.component;

import com.lwlizhe.basemodule.di.scope.ActivityScope;
import com.lwlizhe.common.di.component.AppComponent;
import com.lwlizhe.novel.di.module.NovelReadModule;
import com.lwlizhe.novel.mvp.ui.activity.NovelReadActivity;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/9 0009.
 */
@ActivityScope
@Component(modules = NovelReadModule.class,dependencies = AppComponent.class)
public interface NovelReadComponent {

    void inject(NovelReadActivity activity);

}

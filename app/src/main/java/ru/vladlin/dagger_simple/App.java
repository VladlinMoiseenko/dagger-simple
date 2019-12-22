package ru.vladlin.dagger_simple;

import android.app.Application;

public class App extends Application {

    private static AppComponent component;

    /*
    В методе onCreate создаем компонент.
    На этом месте ваша среда разработки скорее всего будет ругаться на класс DaggerAppComponent.
    Так происходит, потому что класса DaggerAppComponent пока не существует.
    Мы только описали интерфейс компонента AppComponent, но нам надо скомпилировать проект, чтобы даггер создал этот класс-компонент.
    */
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }

}

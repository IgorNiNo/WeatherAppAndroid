package ru.igor_nn.myweatherapp;

public final class PresenterNightTheme {
    //Внутреннее поле, будет хранить единственный экземпляр
    private static PresenterNightTheme instance = null;

    // Поле для синхронизации
    private static final Object syncObj = new Object();

    // Это наше значение switch "Ночная тема"
    private boolean isNightTheme;

    // Конструктор (вызывать извне его нельзя, поэтому он приватный)
    private PresenterNightTheme(){
        isNightTheme = false;
    }

    // взять значение switch "Ночная тема"
    public boolean isNightTheme() {
        return isNightTheme;
    }

    // установить значение switch "Ночная тема"
    public void setNightTheme(boolean nightTheme) {
        isNightTheme = nightTheme;
    }

    // Метод, который возвращает экземпляр объекта. Если объекта нет, то создаем его.
    public static PresenterNightTheme getInstance(){
        // Здесь реализована «ленивая» инициализация объекта, то есть, пока объект не нужен, не создаем его.
        synchronized (syncObj) {
            if (instance == null) {
                instance = new PresenterNightTheme();
            }
            return instance;
        }
    }
}

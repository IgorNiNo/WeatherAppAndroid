package ru.igor_nn.myweatherapp;

public class PresenterAtmoPress {
    //Внутреннее поле, будет хранить единственный экземпляр
    private static PresenterAtmoPress instance = null;

    // Поле для синхронизации
    private static final Object syncObj = new Object();

    // Это наше значение checkBox "Атмосферное давление"
    private boolean isAtmoPress;

    // Конструктор (вызывать извне его нельзя, поэтому он приватный)
    private PresenterAtmoPress(){
        isAtmoPress = false;
    }

    // взять значение checkBox "Атмосферное давление"
    public boolean isAtmoPress() {
        return isAtmoPress;
    }

    // установить значение checkBox "Атмосферное давление"
    public void setAtmoPress(boolean atmoPress) {
        isAtmoPress = atmoPress;
    }

    // Метод, который возвращает экземпляр объекта.
    // Если объекта нет, то создаем его.
    public static PresenterAtmoPress getInstance(){
        // Здесь реализована «ленивая» инициализация объекта,
        // то есть, пока объект не нужен, не создаем его.
        synchronized (syncObj) {
            if (instance == null) {
                instance = new PresenterAtmoPress();
            }
            return instance;
        }
    }
}

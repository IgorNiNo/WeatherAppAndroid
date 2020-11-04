package ru.igor_nn.myweatherapp;

public final class PresenterAutoLoc {
    //Внутреннее поле, будет хранить единственный экземпляр
    private static PresenterAutoLoc instance = null;

    // Поле для синхронизации
    private static final Object syncObj = new Object();

    // Это наше значение switch "Автоматическая локация"
    private boolean isAutoLoc;

    // Конструктор (вызывать извне его нельзя, поэтому он приватный)
    private PresenterAutoLoc(){
        isAutoLoc = false;
    }

    // взять значение switch "Автоматическая локация"
    public boolean isAutoLoc() {
        return isAutoLoc;
    }

    // установить значение switch "Автоматическая локация"
    public void setAutoLoc(boolean autoLoc) {
        isAutoLoc = autoLoc;
    }

    // Метод, который возвращает экземпляр объекта.
    // Если объекта нет, то создаем его.
    public static PresenterAutoLoc getInstance(){
        // Здесь реализована «ленивая» инициализация объекта,
        // то есть, пока объект не нужен, не создаем его.
        synchronized (syncObj) {
            if (instance == null) {
                instance = new PresenterAutoLoc();
            }
            return instance;
        }
    }
}

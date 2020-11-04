package ru.igor_nn.myweatherapp;

public final class PresenterWindSpeed {
    //Внутреннее поле, будет хранить единственный экземпляр
    private static PresenterWindSpeed instance = null;

    // Поле для синхронизации
    private static final Object syncObj = new Object();

    // Это наше значение checkBox "Скорость ветра"
    private boolean isWindSpeed;

    // Конструктор (вызывать извне его нельзя, поэтому он приватный)
    private PresenterWindSpeed(){
        isWindSpeed = false;
    }

    // взять значение checkBox "Скорость ветра"
    public boolean isWindSpeed() {
        return isWindSpeed;
    }

    // установить значение checkBox "Скорость ветра"
    public void setWindSpeed(boolean windSpeed) {
        isWindSpeed = windSpeed;
    }

    // Метод, который возвращает экземпляр объекта. Если объекта нет, то создаем его.
    public static PresenterWindSpeed getInstance(){
        // Здесь реализована «ленивая» инициализация объекта, то есть, пока объект не нужен, не создаем его.
        synchronized (syncObj) {
            if (instance == null) {
                instance = new PresenterWindSpeed();
            }
            return instance;
        }
    }
}
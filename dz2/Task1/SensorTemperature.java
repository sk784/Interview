package dz2.Task1;

interface SensorTemperature{
    int identifier(); // идентификатор датчика
    double temperature(); // температура датчика
    int year();			 // Год
    int day();			 // День года
    int second();		 // Секунда дня
}
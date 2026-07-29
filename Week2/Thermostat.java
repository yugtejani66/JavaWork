package Week2;

public class Thermostat {
private int temperature;
private static final int MIN = 16;
private static final int MAX = 30;
private static int activeCount = 0;
public Thermostat(String location, int startTemp) {
if (startTemp >= MIN && startTemp <= MAX)
temperature = startTemp;
else
temperature = 22;
activeCount++;
}
public Thermostat(String location) {
this(location, 22);
}
public void raise() {
if (temperature < MAX)
temperature++;
else
System.out.println("Already at maximum (30)");
}
public void lower() {
if (temperature > MIN)
temperature--;
else
System.out.println("Already at minimum (16)");
}
public int getTemperature() {
return temperature;
}
public static int getActiveCount() {
return activeCount;
}
public static void main(String[] args) {
Thermostat t1 = new Thermostat("Living Room", 22);
for (int i = 0; i < 10; i++) {
t1.raise();
System.out.println(t1.getTemperature());
}
for (int i = 0; i < 20; i++) {
t1.lower();
System.out.println(t1.getTemperature());
}

}
}